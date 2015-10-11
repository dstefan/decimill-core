package decimill.expression;

import decimill.query.EvalVisitor;
import decimill.query.TimeEvalVisitor;
import decimill.query.CopyReplaceVisitor;
import decimill.lang.DM_Object;

/**
 * @author David Stefan
 */
public class RefNode extends ExprNode {

    private final String namespace;
    private final String id;
    private final String field;

    public RefNode(String namespace, String id, String field) {
        this.namespace = namespace;
        this.id = id;
        this.field = field;
    }

    public RefNode(String namespace, String id) {
        this(namespace, id, null);
    }
    
    public RefNode(String id) {
        this(null, id, null);
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
        return new Reference(namespace, id, field);
    }

    @Override
    public String toString() {
        return (namespace == null ? "" : namespace + ".") + id + (field == null ? "" : "[" + field + "]");
    }
}
