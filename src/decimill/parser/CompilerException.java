package decimill.parser;

/**
 * @author David Stefan
 */
public class CompilerException extends RuntimeException {
    
    private final int line;
    private final int charPos;
    
    public CompilerException(String message, int line, int charPos) {
        super(message);
        this.line = line;
        this.charPos = charPos;
    }
    
    public CompilerException(String message) {
        this(message, 0, 0);
    }
    
    public int getLine() {
        return line;
    }
    
    public int getCharPos() {
        return charPos;
    }
}
