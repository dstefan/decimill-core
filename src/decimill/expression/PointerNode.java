package decimill.expression;

import decimill.query.EvalVisitor;
import decimill.query.TimeEvalVisitor;
import decimill.query.CopyReplaceVisitor;
import decimill.lang.DM_Object;

/**
 * @author David Stefan
 */
public class PointerNode extends ExprNode {

    private final String id;
    private final String field;
    
    public PointerNode(String name, String field) {
        this.id = name;
        this.field = field;
    }
    
    public PointerNode(String name) {
        this(name, null);
    }
    
    public boolean hasField() {
        return field != null;
    }
    
    public String getId() {
        return id;
    }
    
    public String getFieldId() {
        return field;
    }

    @Override
    public DM_Object accept(EvalVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public DM_Object accept(TimeEvalVisitor visitor) {
        return visitor.visit(this);
//        throw new UnsupportedOperationException("This shouldn't get called.");
    }

    @Override
    public ExprNode accept(CopyReplaceVisitor visitor) {
        return visitor.visit(this);
        //throw new UnsupportedOperationException("This shouldn't get called.");
    }
    
    public Pointer toPointer() {
        return new Pointer(id, field);
    }
    
    @Override
    public String toString() {
        return id + (field != null ? "[" + field + "]" : "");
    }
    
    
}
