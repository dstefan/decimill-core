package decimill.scenario;

import decimill.parser.DecimillLexer;
import decimill.parser.ParserErrorListener;
import decimill.parser.ScenarioLexer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import decimill.parser.ScenarioParser;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import org.antlr.v4.runtime.TokenStreamRewriter;

/**
 * @author David Stefan
 */
public class ScenarioCompiler {

    public static String compile(Scenario scenario, String scenarioText) {
        
        ANTLRInputStream in = new ANTLRInputStream(scenarioText);
        DecimillLexer lexer = new DecimillLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ScenarioParser parser = new ScenarioParser(tokens);
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(ParserErrorListener.INSTANCE);

        parser.parse(scenario);
        
        return rewriter.getText();
    }
    
    public static String compileFromFile(Scenario scenario, String filePath) throws IOException {
        Path scenarioPath = FileSystems.getDefault().getPath(filePath);
        String scenarioInput = new String(Files.readAllBytes(scenarioPath));
        return compile(scenario, scenarioInput);
    }
}
