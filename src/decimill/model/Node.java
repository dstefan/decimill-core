package decimill.model;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * @author David Stefan
 */
public class Node {

    private static int counter = 1;

    private final int id;
    private String name;
    private final ArrayList<String> varNames;
    private final ArrayList<Node> children;

    public Node(String name) {
        this.id = counter++;
        this.name = name;
        this.varNames = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public static Node guessFromName(String name) {
        Pattern pattern = Pattern.compile("^Maximise|^Maximize|^Minimise|^Minimize|^Maintain|^Achieve|^Avoid");
        if (pattern.matcher(name).find()) {
            return new Goal(name);
        }
        return new Node(name);
    }

    public void addChild(Node child) {
        children.add(child);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addVarName(String varName) {
        varNames.add(varName);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getVarNames() {
        return varNames;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public static String canonizeDef(String dirtyDef) {
        dirtyDef = dirtyDef.replaceFirst("Def:", "");
        return dirtyDef.trim();
    }

    public String toDot() {

        String dot = "";

        dot += "digraph goals {\n\n";
        dot += "  node [margin=0.05, shape=box, fontsize=10.0, fontname=\"Arial\", height=0.1]\n\n";
        dot += "  n" + getId() + " [label=\"" + getName() + "\"]\n";
        
        for (Node child : children) {
            dot += "  n" + child.getId() + " [label=\"" + child.getName() + "\"]\n";
        }
        
        dot += "\n";

        if (!children.isEmpty()) {
            if (children.size() == 1) {
                dot += "  n" + id + " -> n" + children.get(0).getId() + " [dir=back]\n";
            } else {
                dot += "  o" + id + " [label=\"\", shape=circle, width=0.1, height=0.1]\n";
                dot += "    n" + id + " -> o" + id + " [dir=back]\n";
                for (Node child : children) {
                    dot += "    o" + id + " -> n" + child.getId() + " [arrowhead=none]\n";
                }
            }
            dot += "\n";
        }

        dot += "}";

        return dot;
    }

    @Override
    public String toString() {

        String str = "";

        if (this instanceof Goal) {
            str += "Goal: ";
        } else if (this instanceof Assumption) {
            str += "Assumption: ";
        } else {
            str += "Node: ";
        }

        str += name;

        if (children.size() > 0) {
            str += " <- ";
            for (int i = 0; i < children.size(); i++) {
                str += children.get(i).getName();
                str += i == children.size() - 1 ? "\n" : ", ";
            }
        }

        if (varNames.size() > 0) {
            str += "Variables: ";
            for (int i = 0; i < varNames.size(); i++) {
                str += varNames.get(i);
                str += i == varNames.size() - 1 ? "\n" : ", ";
            }
        }

        return str;
    }
}
