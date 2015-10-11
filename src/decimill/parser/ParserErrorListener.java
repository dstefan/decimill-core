
package decimill.parser;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ParserErrorListener extends BaseErrorListener {

    public static ParserErrorListener INSTANCE = new ParserErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
            int line, int charPositionInLine,
            String msg, RecognitionException e) {
        
        throw new CompilerException("Unexpected input at line " + line + ", character " + charPositionInLine, line, charPositionInLine);
    }
}
