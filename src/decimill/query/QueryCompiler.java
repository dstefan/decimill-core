package decimill.query;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import decimill.Context;
import decimill.Rewriter;
import decimill.adapters.statistics.StatsAdapter;
import decimill.adapters.statistics.StatsAdapterException;
import decimill.expression.ExprNode;
import decimill.expression.Pointer;
import decimill.expression.RefNode;
import decimill.expression.Reference;
import decimill.lang.*;
import decimill.lang.serialize.*;
import decimill.parser.CompilerException;
import decimill.parser.DecimillLexer;
import decimill.parser.QueryParser;
import decimill.stats.Histogram;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

/**
 * @author David Stefan
 */
public class QueryCompiler {

    private final Context ctx;
    private final Memory memory;
    public int from = 0;
    public int to = 0;

    public QueryCompiler(Context ctx) {
        this.ctx = ctx;
        this.memory = new Memory();
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public void assign(String strPointer, DM_Object value) {

        Pattern pattern = Pattern.compile("(.*)\\[(.*)\\]");
        Matcher matcher = pattern.matcher(strPointer);

        if (matcher.matches()) {
            if (matcher.groupCount() == 1) {
                Pointer p = new Pointer(matcher.group(1));
                memory.assign(p, value);
            } else if (matcher.groupCount() == 2) {
                Pointer p = new Pointer(matcher.group(1), matcher.group(2));
                memory.assign(p, value);
            }
        }
    }

    public DM_Object getAssigned(Pointer p) {

        return memory.getAssigned(p);
//        Pattern pattern = Pattern.compile("(.*)\\[(.*)\\]");
//        Matcher matcher = pattern.matcher(strPointer);
//        
//        if (matcher.matches()) {
//            if (matcher.groupCount() == 1) {
//                Pointer p = new Pointer(matcher.group(1));
//                return memory.getAssigned(p);
//            } else if (matcher.groupCount() == 2) {
//                Pointer p = new Pointer(matcher.group(1), matcher.group(2));
//                return memory.getAssigned(p);
//            }
//        }
//        
//        return null;
    }

    public void parse(Context ctx, String input) {

        CharStream in = new ANTLRInputStream(input);
        DecimillLexer lexer = new DecimillLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QueryParser parser = new QueryParser(tokens);
        Rewriter rewriter = new Rewriter(new TokenStreamRewriter(tokens));

        parser.removeErrorListeners();
        parser.addErrorListener(decimill.parser.ParserErrorListener.INSTANCE);

        parser.parse(ctx, this, rewriter);
    }

    public void parseFromFile(Context ctx, String filePath) throws IOException {

        Path queryPath = FileSystems.getDefault().getPath(filePath);
        String query = new String(Files.readAllBytes(queryPath));

        CharStream in = new ANTLRInputStream(query);
        DecimillLexer lexer = new DecimillLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QueryParser parser = new QueryParser(tokens);
        Rewriter rewriter = new Rewriter(new TokenStreamRewriter(tokens));

        parser.removeErrorListeners();
        parser.addErrorListener(decimill.parser.ParserErrorListener.INSTANCE);

        parser.parse(ctx, this, rewriter);
    }

    public static String compile(Context ctx, String input) {

        CharStream in = new ANTLRInputStream(input);
        DecimillLexer lexer = new DecimillLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QueryParser parser = new QueryParser(tokens);
        Rewriter rewriter = new Rewriter(new TokenStreamRewriter(tokens));

        parser.removeErrorListeners();
        parser.addErrorListener(decimill.parser.ParserErrorListener.INSTANCE);

        QueryCompiler compiler = new QueryCompiler(ctx);
        parser.parse(ctx, compiler, rewriter);

        return rewriter.getText();
    }

    public static String compileFromFile(Context ctx, String filePath) throws IOException {
        Path queryPath = FileSystems.getDefault().getPath(filePath);
        String query = new String(Files.readAllBytes(queryPath));
        return compile(ctx, query);
    }

    public DM_Object eval(Pointer p, ExprNode expr) {

        EvalVisitor visitor = new EvalVisitor(ctx, memory, from, to);

        DM_Object res = expr.accept(visitor);

        if (p != null) {
            memory.assign(p, res);
        }
        return res;
    }

    public DM_Object eval(ExprNode expr) {
        return eval(null, expr);
    }

    public DM_Object eval(String refString) {
        String[] splitRef = refString.split("\\.");
        RefNode ref = new RefNode(splitRef[0], splitRef[1]);
        return eval(ref);
    }
}
