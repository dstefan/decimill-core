package decimill.query;

import decimill.Context;
import decimill.Function;
import decimill.FunctionInvocationException;
import decimill.expression.*;
import decimill.lang.DM_Array;
import decimill.lang.DM_AssocArray;
import decimill.lang.DM_Double;
import decimill.lang.DM_Integer;
import decimill.lang.DM_Object;
import decimill.lang.DM_String;
import decimill.scenario.Scenario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author David Stefan
 */
public class EvalVisitor {

    private final Context ctx;
    private final Memory memory;
    private final Map<Reference, ExprNode> temp;
    private final int from;
    private final int to;

    public EvalVisitor(Context ctx, Memory memory, int from, int to) {
        this.ctx = ctx;
        this.memory = memory;
        this.temp = new HashMap<>();
        this.from = from;
        this.to = to;
    }

    public void change(Reference ref, ExprNode expr) {
        temp.put(ref, ctx.getAssigned(ref));
        ctx.assign(ref, expr);
    }
    
    public DM_Object getMemoryAssigned(Pointer pointer) {
        return memory.getAssigned(pointer);
    }

    public ExprNode getAssigned(Reference ref) {
        return temp.get(ref);
    }

    public void resetChanges() {
        for (Reference ref : temp.keySet()) {
            ctx.assign(ref, temp.get(ref));
        }
        temp.clear();
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

        Reference ref = var.toReference();

        if (ref.getId().equals("t")) {
            return new DM_Integer(0);
        }
        
        ExprNode expr = ctx.getAssigned(ref);
        
        if (expr == null) {
            throw new EvalVisitorException("Reference '" + ref + "' doesn't exist in this context.");
        }
        
        return expr.accept(this);
    }

    public DM_Object visit(TempRefNode var) {
        
        Reference ref = var.toReference();
        ExprNode expr = temp.get(ref);
        
        if (expr == null) {
            throw new EvalVisitorException("Reference '" + ref + "' doesn't exist in this context.");
        }
        return expr.accept(this);
    }

    public DM_Object visit(EvalNode eval) {

        String cacheKey = eval.toString();
        
        // Fetch from cache if cached
//        if (ctx.isCached(cacheKey)) {
//            return ctx.getCached(cacheKey);
//        }
        
        String scnrName = eval.getScenarioName();
        
        // Only apply changes if scenario provided
        if (scnrName != null) {
            
            Scenario tc = ctx.getScenario(scnrName);

            if (tc == null) {
                throw new EvalVisitorException("Scenario '" + scnrName + "' doesn't exist in this context.");
            }

            Map<Reference, ExprNode> changes = tc.getChanges();

            // Apply changes
            for (Reference ref : changes.keySet()) {
                ExprNode newExpr = changes.get(ref);
                ExprNode tempExpr = newExpr.accept(new CopyReplaceVisitor(ref));
                change(ref, tempExpr);
            }
        }

        TimeEvalVisitor visitor = new TimeEvalVisitor(ctx, this);
        DM_Object sum = new DM_Double(0.0);

        // Eval for given t's
        for (int t = from; t <= to; t++) {
            
            visitor.setT(t);
            Reference ref = eval.asReference();
            ExprNode expr = ctx.getAssigned(ref);
            
            if (expr == null) {
                throw new EvalVisitorException("Reference '" + ref + "' doesn't exist in this context.");
            }
            
            DM_Object res = expr.accept(visitor);
            sum = sum.plus(res);
        }
        
        // Reset changes
        resetChanges();
        
        // Cache result
//        ctx.cache(cacheKey, sum);
        
        return sum;
    }

    public DM_Object visit(PointerNode pointer) {
        
        if (pointer.hasField()) {
            return memory.getAssigned(pointer.toPointer());
        }
        return memory.getAssigned(pointer.toPointer());
    }

    public DM_Object visit(ObjectNode val) {
        return val.getValue();
    }

    public DM_Object visit(ArrayNode node) {

        DM_Array<DM_Object> array = new DM_Array<>();

        for (ExprNode expr : node.getAll()) {
            DM_Object val = expr.accept(this);
            array.add(val);
        }
        return array;
    }

    public DM_Object visit(StringNode str) {
        return new DM_String(str.getString());
    }

    public DM_Object visit(AssocArrayNode node) {
        
        DM_AssocArray array = new DM_AssocArray();
        Map<String, ExprNode> fields = node.getAll();

        for (String key : fields.keySet()) {
            DM_Object o = fields.get(key).accept(this);
            array.put(key, o);
        }
        
        return array;
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
