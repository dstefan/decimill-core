package decimill.expression;

import decimill.query.EvalVisitor;
import decimill.query.TimeEvalVisitor;
import decimill.query.CopyReplaceVisitor;
import decimill.lang.DM_Object;

/**
 * @author David Stefan
 */
public class TempRefNode extends ExprNode {

    private final String namespace;
    private final String id;

    public TempRefNode(String namespace, String name) {
        this.namespace = namespace;
        this.id = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public String getId() {
        return id;
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
    
    public Reference toReference() {
        return new Reference(namespace, id);
    }
    
    @Override
    public String toString() {
        return namespace + "." + id;
    }

}
