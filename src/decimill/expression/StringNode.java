package decimill.expression;

import decimill.query.EvalVisitor;
import decimill.query.TimeEvalVisitor;
import decimill.query.CopyReplaceVisitor;
import decimill.lang.DM_Object;
import decimill.lang.DM_String;

/**
 * @author David Stefan
 */
public class StringNode extends ObjectNode {
    
    private final String str;
    
    public StringNode(String str) {
        this.str = str;
    }
    
    public String getString() {
        return str;
    }
    
    @Override
    public DM_Object buildValue() {
        return new DM_String(str);
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
