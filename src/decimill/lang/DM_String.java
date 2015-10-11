package decimill.lang;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author David Stefan
 */
public class DM_String extends DM_Object {

    private final String string;

    public DM_String(String string) {
        this.string = string;
    }

    public String getValue() {
        return string;
    }

    @Override
    public Object cast(Class t) throws CastException {

        if (t.equals(Integer.class)) {
            return t.cast(Integer.parseInt(string));
        }

        if (t.equals(Double.class)) {
            return t.cast(Double.parseDouble(string));
        }

        if (t.equals(String.class)) {
            return string;
        }

        throw new CastException("Cannot cast " + this.getClass().getName() + " to " + t.getName());
    }

    @Override
    public DM_Object plus(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_String(string + o.toString());
        } else if (o instanceof DM_Double) {
            return new DM_String(string + o.toString());
        } else if (o instanceof DM_String) {
            return new DM_String(string + o.toString());
        } else if (o instanceof DM_Boolean) {
            return new DM_String(string + o.toString());
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).plus(array);
        }

        throw new UnsupportedOperationException(o.getClass().getSimpleName() + " cannot be added to " + getClass().getSimpleName());
    }

    @Override
    public DM_Object minus(DM_Object o) {
        throw new UnsupportedOperationException(o.getClass().getSimpleName() + " cannot be subtracted from " + getClass().getSimpleName());
    }

    @Override
    public DM_Object times(DM_Object o) {
        throw new UnsupportedOperationException(o.getClass().getSimpleName() + " cannot be multiplied by " + getClass().getSimpleName());
    }

    @Override
    public DM_Object div(DM_Object o) {
        throw new UnsupportedOperationException(o.getClass().getSimpleName() + " cannot be divided by " + getClass().getSimpleName());
    }

    @Override
    public DM_Object pow(DM_Object o) {
        throw new UnsupportedOperationException(o.getClass().getSimpleName() + " cannot be raised to " + getClass().getSimpleName() + " power");
    }

    @Override
    public DM_Object lt(DM_Object o) {
        throw new UnsupportedOperationException(o.getClass().getSimpleName() + " cannot be compared width " + getClass().getSimpleName());
    }

    @Override
    public DM_Object gt(DM_Object o) {
        throw new UnsupportedOperationException(o.getClass().getSimpleName() + " cannot be compared width " + getClass().getSimpleName());
    }

    @Override
    public DM_Object eq(DM_Object o) {
        throw new UnsupportedOperationException(o.getClass().getSimpleName() + " cannot be compared width " + getClass().getSimpleName());
    }

    @Override
    public DM_Array toArray(int size) {
        ArrayList<DM_String> values = new ArrayList<>(Collections.nCopies(size, this));
        return new DM_Array<>(values);
    }

    @Override
    public DM_Sample toSample() {
        throw new UnsupportedOperationException("String cannot be converted to sample.");
    }

    @Override
    public String toString() {
        return string;
    }
}
