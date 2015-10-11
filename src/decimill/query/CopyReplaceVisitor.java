package decimill.query;

import decimill.expression.*;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author David Stefan
 */
public class CopyReplaceVisitor {

    private final Reference ref;

    public CopyReplaceVisitor(Reference ref) {
        this.ref = ref;
    }

    public ExprNode visit(PlusNode expr) {
        ExprNode a = expr.getA().accept(this);
        ExprNode b = expr.getB().accept(this);
        return new PlusNode(a, b);
    }

    public ExprNode visit(MinusNode expr) {
        ExprNode a = expr.getA().accept(this);
        ExprNode b = expr.getB().accept(this);
        return new MinusNode(a, b);
    }

    public ExprNode visit(TimesNode expr) {
        ExprNode a = expr.getA().accept(this);
        ExprNode b = expr.getB().accept(this);
        return new TimesNode(a, b);
    }

    public ExprNode visit(DivNode expr) {
        ExprNode a = expr.getA().accept(this);
        ExprNode b = expr.getB().accept(this);
        return new DivNode(a, b);
    }

    public ExprNode visit(PowNode expr) {
        ExprNode a = expr.getA().accept(this);
        ExprNode b = expr.getB().accept(this);
        return new PowNode(a, b);
    }

    public ExprNode visit(LTNode expr) {
        ExprNode a = expr.getA().accept(this);
        ExprNode b = expr.getB().accept(this);
        return new LTNode(a, b);
    }

    public ExprNode visit(GTNode expr) {
        ExprNode a = expr.getA().accept(this);
        ExprNode b = expr.getB().accept(this);
        return new GTNode(a, b);
    }

    public ExprNode visit(EQNode expr) {
        ExprNode a = expr.getA().accept(this);
        ExprNode b = expr.getB().accept(this);
        return new EQNode(a, b);
    }

    public ExprNode visit(RefNode var) {
        if (ref.equals(var.toReference())) {
            return new TempRefNode(var.getNamespace(), var.getId());
        }
        return new RefNode(var.getNamespace(), var.getId());
    }

    public ExprNode visit(TempRefNode var) {
        throw new UnsupportedOperationException("This should never get called.");
    }

    public ExprNode visit(EvalNode eval) {
        throw new UnsupportedOperationException("This should never get called.");
    }

    public ExprNode visit(ObjectNode val) {
        return val;
    }

    public ExprNode visit(ArrayNode arrayNode) {

        ArrayNode arrayNodeCopy = new ArrayNode();

        for (ExprNode expr : arrayNode.getAll()) {
            arrayNodeCopy.add(expr.accept(this));
        }

        return arrayNodeCopy;
    }

    public ExprNode visit(StringNode str) {
        return str;
    }
    
    public ExprNode visit(PointerNode pointer) {
        return pointer;
    }

    public ExprNode visit(AssocArrayNode arrayNode) {

        AssocArrayNode arrayNodeCopy = new AssocArrayNode();
        Map<String, ExprNode> fields = arrayNode.getAll();

        for (String key : fields.keySet()) {
            arrayNodeCopy.put(key, fields.get(key).accept(this));
        }

        return arrayNodeCopy;
    }
    
    public ExprNode visit(FuncNode funcNode) {
        
        ArrayList<ExprNode> paramsCopy = new ArrayList<>();
        
        for (ExprNode param : funcNode.getParams()) {
            paramsCopy.add(param.accept(this));
        }
        
        return new FuncNode(funcNode.getName(), paramsCopy);
    }
}
