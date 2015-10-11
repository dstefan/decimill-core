package decimill.expression;

import decimill.lang.DM_Object;

/**
 * @author David Stefan
 */
public class DistTriangNode extends ObjectNode {

    private final double a;
    private final double b;
    private final double c;
    
    public DistTriangNode(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public DM_Object buildValue() {
        return DM_Object.buildFromTriang(a, b, c);
    }
    
    @Override
    public String toString() {
        return "[" + a + "," + b + "," + c + "]";
    }
}
