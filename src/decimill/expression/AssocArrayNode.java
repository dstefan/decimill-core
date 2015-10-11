package decimill.expression;

import decimill.lang.DM_Array;
import decimill.query.CopyReplaceVisitor;
import decimill.query.EvalVisitor;
import decimill.query.TimeEvalVisitor;
import decimill.lang.DM_Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Experimental node to represent associative arrays in DML.
 * 
 * @author David Stefan
 */
public class AssocArrayNode extends ObjectNode {

    private final Map<String, ExprNode> fields;
    
    public AssocArrayNode() {
        this.fields = new LinkedHashMap<>();
    }
    
    public void put(String key, ExprNode expr) {
        this.fields.put(key, expr);
    }
    
    public ExprNode get(String key) {
        return fields.get(key);
    }
    
    public Map<String, ExprNode> getAll() {
        return fields;
    }
    
    @Override
    public DM_Object buildValue() {
        return new DM_Array(new ArrayList(fields.values()));
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
