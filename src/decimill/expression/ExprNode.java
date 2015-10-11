package decimill.expression;

import decimill.query.EvalVisitor;
import decimill.query.TimeEvalVisitor;
import decimill.query.CopyReplaceVisitor;
import decimill.lang.DM_Object;

/**
 * @author David Stefan
 */
public abstract class ExprNode {

    public abstract DM_Object accept(EvalVisitor visitor);
    
    public abstract DM_Object accept(TimeEvalVisitor visitor);
    
    public abstract ExprNode accept(CopyReplaceVisitor visitor);
}
