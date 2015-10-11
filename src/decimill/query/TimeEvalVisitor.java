package decimill.query;

import decimill.Context;
import decimill.Function;
import decimill.FunctionInvocationException;
import decimill.expression.*;
import decimill.lang.DM_Array;
import decimill.lang.DM_AssocArray;
import decimill.lang.DM_Integer;
import decimill.lang.DM_Object;
import decimill.lang.DM_String;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author David Stefan
 */
public class TimeEvalVisitor {

    private final Context ctx;
    private final EvalVisitor visitor;
    private int t;

    public TimeEvalVisitor(Context ctx, EvalVisitor visitor) {
        this.ctx = ctx;
        this.visitor = visitor;
        this.t = 0;
    }

    public void setT(int t) {
        this.t = t;
    }

    public DM_Object visit(PlusNode op) {

        DM_Object a = op.getA().accept(this);
        DM_Object b = op.getB().accept(this);

        return a.plus(b);
    }

    public DM_Object visit(MinusNode op) {

        DM_Object a = op.getA().accept(this);
        DM_Object b = op.getB().accept(this);

        return a.minus(b);
    }

    public DM_Object visit(TimesNode op) {

        DM_Object a = op.getA().accept(this);
        DM_Object b = op.getB().accept(this);

        return a.times(b);
    }

    public DM_Object visit(DivNode op) {

        DM_Object a = op.getA().accept(this);
        DM_Object b = op.getB().accept(this);

        return a.div(b);
    }

    public DM_Object visit(PowNode op) {

        DM_Object a = op.getA().accept(this);
        DM_Object b = op.getB().accept(this);

        return a.pow(b);
    }

    public DM_Object visit(LTNode op) {

        DM_Object a = op.getA().accept(this);
        DM_Object b = op.getB().accept(this);

        return a.lt(b);
    }

    public DM_Object visit(GTNode op) {

        DM_Object a = op.getA().accept(this);
        DM_Object b = op.getB().accept(this);

        return a.gt(b);
    }

    public DM_Object visit(EQNode op) {

        DM_Object a = op.getA().accept(this);
        DM_Object b = op.getB().accept(this);

        return a.eq(b);
    }

    public DM_Object visit(RefNode var) {

        if (var.getId().equals("t")) {
            return new DM_Integer(t);
        }

        Reference ref = var.toReference();
        ExprNode expr = ctx.getAssigned(ref);

        if (expr == null) {
            throw new EvalVisitorException("Reference '" + ref + "' doesn't exist in this context.");
        }
        return expr.accept(this);
    }
    
    public DM_Object visit(PointerNode pointer) {
        return visitor.getMemoryAssigned(pointer.toPointer());
    }

    public DM_Object visit(TempRefNode var) {
        Reference ref = var.toReference();
        ExprNode expr = visitor.getAssigned(ref);
        return expr.accept(this);
    }

    public DM_Object visit(EvalNode eval) {
        throw new UnsupportedOperationException("TimeEval visitor should not handle EvalNodes.");
    }

    public DM_Object visit(ObjectNode val) {
        return val.getValue();
    }

    public DM_Object visit(ArrayNode node) {

        DM_Array array = new DM_Array();

        for (ExprNode expr : node.getAll()) {
            array.add(expr.accept(this));
        }
        return array;
    }

//    public DM_Object visit(AssocArrayNode node) {
//
//        // HERE!!!
//        System.out.println(node);
//        
//        DM_AssocArray array = new DM_AssocArray();
//        Map<String, ExprNode> fields = node.getAll();
//
//        for (String key : fields.keySet()) {
//            DM_Object val = fields.get(key).accept(this);
//            array.put(key, val);
//        }
//        return array;
//    }
    
    public DM_Object visit(AssocArrayNode node) {
        
        DM_AssocArray array = new DM_AssocArray();
        Map<String, ExprNode> fields = node.getAll();

        for (String key : fields.keySet()) {
            DM_Object o = fields.get(key).accept(this);
            array.put(key, o);
        }
        
        return array;
    }

    public DM_Object visit(StringNode str) {
        return new DM_String(str.getString());
    }

    public DM_Object visit(FuncNode fn) {

        ArrayList<Object> vals = new ArrayList<>();
        ArrayList<ExprNode> params = fn.getParams();

        for (ExprNode param : params) {
            vals.add(param.accept(this));
        }

        Function fx = ctx.getFunction(fn.getName());

        if (fx == null) {
            throw new RuntimeException("Function '" + fn.getName() + "' doesn't exist");
        }

        DM_Object res = null;

        try {
            res = ctx.getFunction(fn.getName()).invoke(fn.getName(), vals);
        } catch (FunctionInvocationException e) {
            throw new EvalVisitorException(e.getMessage());
        }

        return res;
    }
}
