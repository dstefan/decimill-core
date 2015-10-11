package decimill;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

/**
 * @author David Stefan
 */
public class TextRewriter {

    public static String rewriteNamespace(TokenStream tokens, String before, String after) {

        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);

        tokens.consume();

        while (tokens.get(tokens.index()).getType() != -1) {
            Token token = tokens.get(tokens.index());
            if (token.getType() == 6 && token.getText().equals(before)) {
                rewriter.insertBefore(tokens.index(), after);
                rewriter.delete(tokens.index());
            }
            tokens.consume();
        }

        return rewriter.getText();
    }
}
