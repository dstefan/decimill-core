package decimill.expression;

import decimill.lang.DM_Array;
import decimill.query.CopyReplaceVisitor;
import decimill.query.EvalVisitor;
import decimill.query.TimeEvalVisitor;
import decimill.lang.DM_Object;
import java.util.ArrayList;

/**
 * @author David Stefan
 */
public class ArrayNode extends ObjectNode {

    private final ArrayList<ExprNode> values;

    public ArrayNode() {
        this.values = new ArrayList<>();
    }

    public void add(ExprNode expr) {
        values.add(expr);
    }

    public ExprNode get(int i) {
        return values.get(i);
    }

    public ArrayList<ExprNode> getAll() {
        return values;
    }
    
    @Override
    public DM_Object buildValue() {
        return new DM_Array(values);
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
        //throw new UnsupportedOperationException("ArrayNode.accept(CopyReplaceVisitor) isn't supported yet.");
    }

}
