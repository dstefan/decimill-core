package decimill.expression;

/**
 * @author David Stefan
 */
public class Pointer {

    private final String id;
    private final String field;
    
    public Pointer(String name, String field) {
        this.id = name;
        this.field = field;
    }
    
    public Pointer(String name) {
        this(name, null);
    }
    
    public String getId() {
        return id;
    }
    
    public String getField() {
        return field;
    }
    
    public boolean hasField() {
        return field != null;
    }
    
    @Override
    public String toString() {
        return id + (field != null ? "[" + field + "]" : "");
    }
}
