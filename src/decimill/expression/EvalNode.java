package decimill.expression;

import decimill.query.EvalVisitor;
import decimill.query.TimeEvalVisitor;
import decimill.query.CopyReplaceVisitor;
import decimill.lang.DM_Object;

/**
 * @author David Stefan
 */
public class EvalNode extends ExprNode {

    private final String namespace;
    private final String id;
    private final String scenarioName;
    
    public EvalNode(String namespace, String id, String scenarioName) {
        this.namespace = namespace;
        this.id = id;
        this.scenarioName = scenarioName;
    }
    
    public EvalNode(String namespace, String id) {
        this(namespace, id, null);
    }
    
    public String getNamespace() {
        return namespace;
    }
    
    public String getId() {
        return id;
    }
    
    public String getScenarioName() {
        return scenarioName;
    }
    
    public Reference asReference() {
        return new Reference(namespace, id);
    }

    @Override
    public DM_Object accept(EvalVisitor visitor) {
        return visitor.visit(this);
    }
    
    @Override
    public DM_Object accept(TimeEvalVisitor visitor) {
        throw new UnsupportedOperationException("This should never get called.");
    }

    @Override
    public ExprNode accept(CopyReplaceVisitor visitor) {
        return visitor.visit(this);
    }
    
    @Override
    public String toString() {
        return namespace + "." + id + (scenarioName != null ? "'" + scenarioName : "'");
    }
}
