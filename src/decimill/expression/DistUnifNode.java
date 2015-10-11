package decimill.expression;

import decimill.lang.DM_Object;

/**
 * @author David Stefan
 */
public class DistUnifNode extends ObjectNode {
    
    private final double a;
    private final double b;
    
    public DistUnifNode(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public DM_Object buildValue() {
        return DM_Object.buildFromUnif(a, b);
    }
    
    @Override
    public String toString() {
        return "[" + a + "," + b + "]u";
    }
       
}
