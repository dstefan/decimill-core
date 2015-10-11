package decimill.expression;

import decimill.query.EvalVisitor;
import decimill.query.TimeEvalVisitor;
import decimill.query.CopyReplaceVisitor;
import decimill.lang.DM_Object;

/**
 * @author David Stefan
 */
public class TimesNode extends BinaryOpNode {

    public TimesNode(ExprNode a, ExprNode b) {
        super(a, b);
    }
    
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
