package decimill.expression;

import decimill.query.EvalVisitor;
import decimill.query.TimeEvalVisitor;
import decimill.query.CopyReplaceVisitor;
import decimill.lang.DM_Object;

/**
 * @author David Stefan
 */
public abstract class ObjectNode extends ExprNode {
    
    private DM_Object cache = null;

    public DM_Object getValue() {
        if (cache == null) {
            cache = buildValue();
        }
        return cache;
    }
    
    public abstract DM_Object buildValue();
    
    @Override
    public DM_Object accept(EvalVisitor visitor) {
        return visitor.visit(this);
    }
    
    @Override
    public DM_Object accept(TimeEvalVisitor visitor) {
        return visitor.visit(this);
    }
    
    @Override
    public ExprNode accept(CopyReplaceVisitor visitor) {
        return visitor.visit(this);
    }
}
