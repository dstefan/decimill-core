package decimill.expression;

import decimill.lang.DM_Double;
import decimill.lang.DM_Object;

/**
 * @author David Stefan
 */
public class DoubleNode extends ObjectNode {

    private final Double value;
    
    public DoubleNode(Double value) {
        this.value = value;
    }

    @Override
    public DM_Object buildValue() {
        return new DM_Double(value);
    }
    
    @Override
    public String toString() {
        return value + "";
    }
    
    
}
