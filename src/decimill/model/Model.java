package decimill.model;

import decimill.expression.AssocArrayNode;
import decimill.expression.ExprNode;
import decimill.expression.ObjectNode;
import decimill.expression.Reference;
import decimill.parser.CompilerException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author David Stefan
 */
public class Model {

    private final int id;
    private final String namespace;
    private final Map<String, Node> nodes;
    private final Map<String, ExprNode> assignments;
    private final ArrayList<String> varNames;
    private final ArrayList<String> usedVarNames;
    private final ArrayList<String> varNamesLHS;
    private final ArrayList<String> assignedParams;

    public Model(int id, String namespace) {
        this.id = id;
        this.namespace = namespace;
        this.nodes = new HashMap<>();
        this.assignments = new HashMap<>();
        this.varNames = new ArrayList<>();
        this.varNamesLHS = new ArrayList<>();
        this.usedVarNames = new ArrayList<>();
        this.assignedParams = new ArrayList<>();
    }
    
    public void addNode(Node node) {
        nodes.put(node.getName(), node);
    }

    public Node addNodeIfNotExists(Node node) {
        
        String name = node.getName();
        
        // Create and add node if not exists
        if (!nodes.containsKey(name)) {
            nodes.put(name, node);
        }
        
        // Return existing node
        return nodes.get(name);
    }

    public Node addNodeByNameIfNotExists(String name) {

        // Create and add node if not exists
        if (!nodes.containsKey(name)) {
            nodes.put(name, new Node(name));
        }
        
        // Return existing node
        return nodes.get(name);
    }
    
    public void assign(Reference ref, ExprNode expr) {
        if (ref.hasField()) {
            assign(ref.getId(), ref.getField(), expr);
        } else {
            assign(ref.getId(), expr);
        }
    }

    public void assign(String id, ExprNode expr) {
        // Add to assigned params if not there already
        if (expr instanceof ObjectNode && !assignedParams.contains(id)) {
            assignedParams.add(id);
        }
        assignments.put(id, expr);
    }
    
    public void assign(String id, String field, ExprNode expr) {
        
        ExprNode node = assignments.get(id);
        
        if (node == null) {
            node = assignments.put(id, new AssocArrayNode());
        } else if (!(node instanceof AssocArrayNode)) {
            node = assignments.put(id, new AssocArrayNode());
        }

        if (!node.getClass().isAssignableFrom(AssocArrayNode.class)) {
            throw new CompilerException("Reference '" + namespace + "." + id + "' isn't an associative array. Field '" + field + "' cannot be assigned to it.");
        }
        
        ((AssocArrayNode) node).put(field, expr);
    }
    
    public void addVarName(String varName) {
        if (!varNames.contains(varName)) {
            varNames.add(varName);
        }
    }

    public void addUsedVarName(String varName) {

        // First add to all variable names
        addVarName(varName);
        
        // Ignore action if variable name already exists
        if (usedVarNames.contains(varName)) {
            return;
        }

        usedVarNames.add(varName);
    }

    public void addVarNameLHS(String varName) {
        
        // First add to all variable names
        addUsedVarName(varName);
        
        // Add into LHS only if it's not there already
        if (!varNamesLHS.contains(varName)) {
            varNamesLHS.add(varName);
        }
    }
    
    public int getId() {
        return id;
    }

    public String getNamespace() {
        return namespace;
    }
    
    public Map<String, Node> getNodes() {
        return nodes;
    }

    public Node getNode(String name) {
        return nodes.get(name);
    }
    
    public boolean hasNodes() {
        return nodes.size() > 0;
    }
    
    public ExprNode getAssigned(Reference ref) {
        if (ref.hasField()) {
            return getAssigned(ref.getId(), ref.getField());
        } else {
            return getAssigned(ref.getId());
        }
    }

    public ExprNode getAssigned(String id) {
        //System.out.println(((AssocArrayNode) assignments.get(id)).g);
        return assignments.get(id);
    }
    
    public ExprNode getAssigned(String id, String field) {
        ExprNode node = assignments.get(id);
        if (!(node instanceof AssocArrayNode)) {
            return null;
        }
        return ((AssocArrayNode) node).get(field);
    }

    public ArrayList<String> getVarNames() {
        return varNames;
    }
    
    public ArrayList<String> getUsedVarNames() {
        return usedVarNames;
    }
    
    public ArrayList<String> getUnusedVarNames() {
        ArrayList<String> tempVarNames = (ArrayList<String>) varNames.clone();
        tempVarNames.removeAll(usedVarNames);
        return tempVarNames;
    }

    public ArrayList<String> getAssignedVarNames() {
        return varNamesLHS;
    }

    public ArrayList<String> getUnassignedVarNames() {
        ArrayList<String> tempUsedVarNames = (ArrayList<String>) usedVarNames.clone();
        tempUsedVarNames.removeAll(varNamesLHS);
        return tempUsedVarNames;
    }
    
    public ArrayList<String> getAssignedParams() {
        return assignedParams;
    }

    public boolean hasNode(String name) {
        return nodes.containsKey(name);
    }

    public boolean hasAssignment(String varName) {
        return assignments.containsKey(varName);
    }
    
    public String toDot() {
        
        String dot = "";
        
        dot += "digraph goals {\n\n";
        dot += "  node [margin=0.05, shape=box, fontsize=10.0, fontname=\"Arial\", height=0.1]\n\n";
        
        // Initialise nodes
        for (Node node : nodes.values()) {
            dot += "  n" + node.getId() + " [label=\"" + node.getName() + "\"]\n";
        }        
        dot += "\n";
        
        // Refine nodes into subnodes
        for (Node node : nodes.values()) {
            ArrayList<Node> children = node.getChildren();
            if (children.isEmpty()) {
                continue;
            }
            if (children.size() == 1) {
                dot += "  n" + node.getId() + " -> n" + children.get(0).getId() + " [dir=back]\n";
            } else {
                dot += "  o" + node.getId() + " [label=\"\", shape=circle, width=0.1, height=0.1]\n";
                dot += "    n" + node.getId() + " -> o" + node.getId() + " [dir=back]\n";
                for (Node child : children) {
                    dot += "    o" + node.getId() + " -> n" + child.getId() + " [arrowhead=none]\n";
                }
            }
            dot += "\n";
        }
        dot += "}";
        
        return dot;
    }

    @Override
    public String toString() {

        String str = "Model: " + namespace + "\n\n";

        if (!nodes.isEmpty()) {
            for (Node node : nodes.values()) {
                str += node + "\n";
            }
        }
        return str;
    }
}
