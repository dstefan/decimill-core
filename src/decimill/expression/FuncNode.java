package decimill.expression;

import decimill.query.EvalVisitor;
import decimill.query.TimeEvalVisitor;
import decimill.query.CopyReplaceVisitor;
import decimill.lang.DM_Object;
import java.util.ArrayList;

/**
 * @author David Stefan
 */
public class FuncNode extends ExprNode {

    private final String name;
    private final ArrayList<ExprNode> params;
    
    public FuncNode(String name, ArrayList<ExprNode> params) {
        this.name = name;
        this.params = params;
    }
    
    public String getName() {
        return name;
    }
    
    public ArrayList<ExprNode> getParams() {
        return params;
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
