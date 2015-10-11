package decimill.expression;

import decimill.lang.DM_Object;

/**
 * @author David Stefan
 */
public class Dist90CINode extends ObjectNode {

    private final Double lb;
    private final Double ub;

    public Dist90CINode(Double lb, Double ub) {
        this.lb = lb;
        this.ub = ub;
    }

    @Override
    public DM_Object buildValue() {
        return DM_Object.buildFrom90CI(lb, ub);
    }

    @Override
    public String toString() {
        return "[" + lb + "," + ub + "]";
    }
}
