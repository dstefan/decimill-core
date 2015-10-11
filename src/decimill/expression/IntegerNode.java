package decimill.expression;

import decimill.lang.DM_Integer;
import decimill.lang.DM_Object;

/**
 * @author David Stefan
 */
public class IntegerNode extends ObjectNode {

    private final Integer value;

    public IntegerNode(Integer value) {
        this.value = value;
    }

    @Override
    public DM_Object buildValue() {
        return new DM_Integer(value);
    }

    @Override
    public String toString() {
        return value + "";
    }
}
