package decimill.lang;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author David Stefan
 */
public class DM_Integer extends DM_Object {

    private final Integer value;

    public DM_Integer(Integer value) {
        this.value = value;
    }

    @Override
    public Object cast(Class t) throws CastException {

        if (t.equals(Integer.class)) {
            return t.cast(value);
        }

//        if (t.equals(Double.class)) {
//            return t.cast(value.doubleValue());
//        }

        if (t.equals(DM_Integer.class)) {
            return new DM_Integer(value);
        }
        
        if (t.equals(DM_Double.class)) {
            return new DM_Double(value.doubleValue());
        }
        
        if (t.equals(DM_Boolean.class)) {
            return new DM_Boolean(value != 0);
        }

        if (t.equals(String.class)) {
            return t.cast(value + "");
        }

//        if (t.equals(DM_Array.class)) {
//            return toArray(DM_Object.sampleSize);
//        }

        throw new CastException("Cannot cast " + this.getClass().getName() + " to " + t.getName());
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public DM_Object plus(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Integer(value + ((DM_Integer) o).getValue());
        } else if (o instanceof DM_Double) {
            return new DM_Double(value + ((DM_Double) o).getValue());
        } else if (o instanceof DM_String) {
            return new DM_String(value.toString() + ((DM_String) o).getValue());
        } else if (o instanceof DM_Boolean) {
            return new DM_Integer(value + ((DM_Boolean) o).toInteger());
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).plus(array);
        } else if (o instanceof DM_Sample) {
            DM_Sample sample = (DM_Sample) o;
            return toSample().plus(sample);
        }

        throw new UnsupportedOperationException(o.getClass().getSimpleName() + " cannot be added to " + getClass().getSimpleName());
    }

    @Override
    public DM_Object minus(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Integer(value - ((DM_Integer) o).getValue());
        } else if (o instanceof DM_Double) {
            return new DM_Double(value - ((DM_Double) o).getValue());
        } else if (o instanceof DM_String) {
            throw new RuntimeException("String cannot be subtracted from Integer");
        } else if (o instanceof DM_Boolean) {
            return new DM_Integer(value - ((DM_Boolean) o).toInteger());
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).minus(array);
        } else if (o instanceof DM_Sample) {
            DM_Sample sample = (DM_Sample) o;
            return toSample().minus(sample);
        }

        throw new UnsupportedOperationException(o.getClass().getSimpleName() + " cannot be subtracted from " + getClass().getSimpleName());
    }

    @Override
    public DM_Object times(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Integer(value * ((DM_Integer) o).getValue());
        } else if (o instanceof DM_Double) {
            return new DM_Double(value * ((DM_Double) o).getValue());
        } else if (o instanceof DM_String) {
            throw new RuntimeException("Integer cannot be mutliplied by String");
        } else if (o instanceof DM_Boolean) {
            return new DM_Integer(value * ((DM_Boolean) o).toInteger());
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).times(array);
        } else if (o instanceof DM_Sample) {
            DM_Sample sample = (DM_Sample) o;
            return toSample().times(sample);
        }

        throw new UnsupportedOperationException(getClass().getSimpleName() + " cannot be multiplied by " + o.getClass().getSimpleName());
    }

    @Override
    public DM_Object div(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Integer(value / ((DM_Integer) o).getValue());
        } else if (o instanceof DM_Double) {
            return new DM_Double(value / ((DM_Double) o).getValue());
        } else if (o instanceof DM_String) {
            throw new RuntimeException("Integer cannot be divided by String");
        } else if (o instanceof DM_Boolean) {
            return new DM_Integer(value / ((DM_Boolean) o).toInteger());
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).div(array);
        } else if (o instanceof DM_Sample) {
            DM_Sample sample = (DM_Sample) o;
            return toSample().div(sample);
        }

        throw new UnsupportedOperationException(getClass().getSimpleName() + " cannot be divided by " + o.getClass().getSimpleName());
    }

    @Override
    public DM_Object pow(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Double(Math.pow(value, ((DM_Integer) o).getValue()));
        } else if (o instanceof DM_Double) {
            return new DM_Double(Math.pow(value, ((DM_Double) o).getValue()));
        } else if (o instanceof DM_String) {
            throw new RuntimeException("Integer cannot be raised to String power");
        } else if (o instanceof DM_Boolean) {
            return new DM_Double(Math.pow(value, ((DM_Boolean) o).toInteger()));
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).pow(array);
        } else if (o instanceof DM_Sample) {
            DM_Sample sample = (DM_Sample) o;
            return toSample().pow(sample);
        }

        throw new UnsupportedOperationException(getClass().getSimpleName() + " cannot be raised to " + o.getClass().getSimpleName() + " power");
    }

    @Override
    public DM_Object lt(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Boolean(value < ((DM_Integer) o).getValue());
        } else if (o instanceof DM_Double) {
            return new DM_Boolean(value < ((DM_Double) o).getValue());
        } else if (o instanceof DM_String) {
            throw new RuntimeException("Integer cannot be compared with String");
        } else if (o instanceof DM_Boolean) {
            return new DM_Boolean(value < ((DM_Boolean) o).toInteger());
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).lt(array);
        } else if (o instanceof DM_Sample) {
            DM_Sample sample = (DM_Sample) o;
            return toSample().lt(sample);
        }

        throw new UnsupportedOperationException(getClass().getSimpleName() + " cannot be compared with " + o.getClass().getSimpleName());
    }

    @Override
    public DM_Object gt(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Boolean(value > ((DM_Integer) o).getValue());
        } else if (o instanceof DM_Double) {
            return new DM_Boolean(value > ((DM_Double) o).getValue());
        } else if (o instanceof DM_String) {
            throw new RuntimeException("Integer cannot be compared with String");
        } else if (o instanceof DM_Boolean) {
            return new DM_Boolean(value > ((DM_Boolean) o).toInteger());
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).gt(array);
        } else if (o instanceof DM_Sample) {
            DM_Sample sample = (DM_Sample) o;
            return toSample().gt(sample);
        }

        throw new UnsupportedOperationException(getClass().getSimpleName() + " cannot be compared with " + o.getClass().getSimpleName());
    }

    @Override
    public DM_Object eq(DM_Object o) {

        if (o instanceof DM_Integer) {
            return new DM_Boolean(value == ((DM_Integer) o).getValue());
        } else if (o instanceof DM_Double) {
            return new DM_Boolean(value.doubleValue() == ((DM_Double) o).getValue());
        } else if (o instanceof DM_String) {
            throw new RuntimeException("Integer cannot be compared with String");
        } else if (o instanceof DM_Boolean) {
            return new DM_Boolean(value == ((DM_Boolean) o).toInteger());
        } else if (o instanceof DM_Array) {
            DM_Array array = (DM_Array) o;
            return toArray(array.size()).eq(array);
        } else if (o instanceof DM_Sample) {
            DM_Sample sample = (DM_Sample) o;
            return toSample().eq(sample);
        }

        throw new UnsupportedOperationException(getClass().getSimpleName() + " cannot be compared with " + o.getClass().getSimpleName());
    }

    @Override
    public DM_Array<DM_Integer> toArray(int size) {
        ArrayList<DM_Integer> values = new ArrayList<>(Collections.nCopies(size, this));
        return new DM_Array<>(values);
    }

    @Override
    public DM_Sample toSample() {
        DM_Sample sample = new DM_Sample();
        for (int i = 0; i < sampleSize; i++) {
            sample.add(new DM_Double(value.doubleValue()));
        }
        return sample;
    }

    @Override
    public String toString() {
        return value + "";
    }

}
