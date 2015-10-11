package decimill.lang;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author David Stefan
 */
public class DM_Boolean extends DM_Object {

    private final Boolean value;

    public DM_Boolean(Boolean value) {
        this.value = value;
    }

    @Override
    public Object cast(Class t) throws CastException {

        parseNumber:

        if (t.equals(Integer.class)) {
            return t.cast(value ? 1 : 0);
        }

        if (t.equals(Double.class)) {
            return t.cast(value ? 1.0 : 0.0);
        }

        if (t.equals(Boolean.class)) {
            return value;
        }

        if (t.equals(DM_Integer.class)) {
            return new DM_Integer(value ? 1 : 0);
        }

        if (t.equals(DM_Double.class)) {
            return new DM_Double(value ? 1.0 : 0.0);
        }

        if (t.equals(DM_Boolean.class)) {
            return new DM_Boolean(value);
        }

        if (t.equals(String.class)) {
            return value.toString();
        }

        throw new CastException("Cannot cast " + this.getClass().getName() + " to " + t.getName());
    }

    public Boolean getValue() {
        return value;
    }

    public Integer toInteger() {
        return value ? 1 : 0;
    }

    public Double toDouble() {
        return value ? 1.0 : 0.0;
    }

    @Override
    public DM_Object plus(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Integer(toInteger() + ((DM_Integer) o).getValue());
        } else if (o instanceof DM_Double) {
            return new DM_Double(toDouble() + ((DM_Double) o).getValue());
        } else if (o instanceof DM_String) {
            return new DM_String(toString() + ((DM_String) o).getValue());
        } else if (o instanceof DM_Boolean) {
            return new DM_Integer(toInteger() + ((DM_Boolean) o).toInteger());
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).plus(array);
        }

        throw new UnsupportedOperationException(o.getClass().getSimpleName() + " cannot be added to " + getClass().getSimpleName());
    }

    @Override
    public DM_Object minus(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Integer(toInteger() - ((DM_Integer) o).getValue());
        } else if (o instanceof DM_Double) {
            return new DM_Double(toDouble() - ((DM_Double) o).getValue());
        } else if (o instanceof DM_String) {
            throw new RuntimeException("String cannot be subtracted from Boolean");
        } else if (o instanceof DM_Boolean) {
            return new DM_Integer(toInteger() - ((DM_Boolean) o).toInteger());
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).minus(array);
        }

        throw new UnsupportedOperationException(o.getClass().getSimpleName() + " cannot be subtracted from " + getClass().getSimpleName());
    }

    @Override
    public DM_Object times(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Integer(toInteger() * ((DM_Integer) o).getValue());
        } else if (o instanceof DM_Double) {
            return new DM_Double(toDouble() * ((DM_Double) o).getValue());
        } else if (o instanceof DM_String) {
            throw new RuntimeException("Boolean cannot be multiplied by String");
        } else if (o instanceof DM_Boolean) {
            return new DM_Integer(toInteger() * ((DM_Boolean) o).toInteger());
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).times(array);
        }

        throw new UnsupportedOperationException(getClass().getSimpleName() + " cannot be multiplied by " + o.getClass().getSimpleName());
    }

    @Override
    public DM_Object div(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Integer(toInteger() / ((DM_Integer) o).getValue());
        } else if (o instanceof DM_Double) {
            return new DM_Double(toDouble() / ((DM_Double) o).getValue());
        } else if (o instanceof DM_String) {
            throw new RuntimeException("Boolean cannot be divided by String");
        } else if (o instanceof DM_Boolean) {
            return new DM_Integer(toInteger() / ((DM_Boolean) o).toInteger());
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).div(array);
        }

        throw new UnsupportedOperationException(getClass().getSimpleName() + " cannot be divided by " + o.getClass().getSimpleName());
    }

    @Override
    public DM_Object pow(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Double(Math.pow(toInteger(), ((DM_Integer) o).getValue()));
        } else if (o instanceof DM_Double) {
            return new DM_Double(Math.pow(toDouble(), ((DM_Double) o).getValue()));
        } else if (o instanceof DM_String) {
            throw new RuntimeException("Boolean cannot be raised to String power");
        } else if (o instanceof DM_Boolean) {
            return new DM_Double(Math.pow(toInteger(), ((DM_Boolean) o).toInteger()));
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).pow(array);
        }

        throw new UnsupportedOperationException(getClass().getSimpleName() + " cannot be raised to " + o.getClass().getSimpleName() + " power");
    }

    @Override
    public DM_Object lt(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Boolean(toInteger() < ((DM_Integer) o).getValue());
        } else if (o instanceof DM_Double) {
            return new DM_Boolean(toDouble() < ((DM_Double) o).getValue());
        } else if (o instanceof DM_String) {
            throw new RuntimeException("Boolean cannot be compared with String");
        } else if (o instanceof DM_Boolean) {
            return new DM_Boolean(toInteger() < ((DM_Boolean) o).toInteger());
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).lt(array);
        }

        throw new UnsupportedOperationException(getClass().getSimpleName() + " cannot be compared with " + o.getClass().getSimpleName());
    }

    @Override
    public DM_Object gt(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Boolean(toInteger() > ((DM_Integer) o).getValue());
        } else if (o instanceof DM_Double) {
            return new DM_Boolean(toDouble() > ((DM_Double) o).getValue());
        } else if (o instanceof DM_String) {
            throw new RuntimeException("Boolean cannot be compared with String");
        } else if (o instanceof DM_Boolean) {
            return new DM_Boolean(toInteger() > ((DM_Boolean) o).toInteger());
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).gt(array);
        }

        throw new UnsupportedOperationException(getClass().getSimpleName() + " cannot be compared with " + o.getClass().getSimpleName());
    }

    @Override
    public DM_Object eq(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Boolean(toInteger() == ((DM_Integer) o).getValue());
        } else if (o instanceof DM_Double) {
            return new DM_Boolean(toDouble() == ((DM_Double) o).getValue());
        } else if (o instanceof DM_String) {
            throw new RuntimeException("Boolean cannot be compared with String");
        } else if (o instanceof DM_Boolean) {
            return new DM_Boolean(toInteger() == ((DM_Boolean) o).toInteger());
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).eq(array);
        }

        throw new UnsupportedOperationException(getClass().getSimpleName() + " cannot be compared with " + o.getClass().getSimpleName());
    }

    @Override
    public DM_Array toArray(int size) {
        ArrayList<DM_Boolean> values = new ArrayList<>(Collections.nCopies(size, this));
        return new DM_Array<>(values);
    }

    @Override
    public DM_Sample toSample() {
        DM_Sample sample = new DM_Sample();
        for (int i = 0; i < sampleSize; i++) {
            sample.add(new DM_Double(value ? 1.0 : 0.0));
        }
        return sample;
    }

    @Override
    public String toString() {
        return value ? "true" : "false";
    }

}
