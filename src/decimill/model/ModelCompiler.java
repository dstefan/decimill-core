package decimill.model;

import decimill.Rewriter;
import decimill.parser.DecimillLexer;
import decimill.parser.ParserErrorListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import decimill.parser.ModelParser;
import java.nio.file.FileSystems;
import org.antlr.v4.runtime.TokenStreamRewriter;

/**
 * @author David Stefan
 */
public class ModelCompiler {

    public static String compile(Model model, String modelText) {
        
        ANTLRInputStream in = new ANTLRInputStream(modelText);
        DecimillLexer lexer = new DecimillLexer(in);
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ModelParser parser = new ModelParser(tokens);
        Rewriter rewriter = new Rewriter(new TokenStreamRewriter(tokens));
        
        parser.removeErrorListeners();
        parser.addErrorListener(ParserErrorListener.INSTANCE);
        
        parser.parse(model, rewriter);
        
        return rewriter.getText();
    }
    
    public static String compileFromFile(Model model, String filePath) throws IOException {
        Path modelPath = FileSystems.getDefault().getPath(filePath);
        String modelInput = new String(Files.readAllBytes(modelPath));
        return compile(model, modelInput);
    }
}
