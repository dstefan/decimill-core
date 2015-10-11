package decimill.scenario;

import decimill.expression.ExprNode;
import decimill.expression.Reference;
import java.util.HashMap;
import java.util.Map;

/**
 * @author David Stefan
 */
public class Scenario {

    private final int id;
    private final String namespace;
    private final Map<String, ExprNode> assignments;
    private final Map<Reference, ExprNode> changes;

    public Scenario(int id, String namespace) {
        this.id = id;
        this.namespace = namespace;
        this.assignments = new HashMap<>();
        this.changes = new HashMap<>();
    }
    
    public void assign(String id, ExprNode expr) {
        assignments.put(id, expr);
    }

    public void addChange(Reference ref, ExprNode expr) {
        changes.put(ref, expr);
    }

    public int getId() {
        return id;
    }
    
    public String getNamespace() {
        return namespace;
    }

    public ExprNode getAssigned(String varName) {
        return assignments.get(varName);
    }
    
    public Map<Reference, ExprNode> getChanges() {
        return changes;
    }
    
    public boolean hasAssignment(String varName) {
        return assignments.containsKey(varName);
    }

    @Override
    public String toString() {
        
        String str = "Scenario: " + namespace + "\n\n";
        
        for (Reference ref : changes.keySet()) {
            str += ref + " = " + changes.get(ref) + "\n";
        }
        return str;
    }
}
