package decimill.lang;

import java.util.ArrayList;

/**
 * @author David Stefan
 * @param <T>
 */
public class DM_Array<T extends DM_Object> extends DM_Object {

    protected final ArrayList<T> values;

    public DM_Array() {
        this.values = new ArrayList<>();
    }

    public DM_Array(ArrayList<T> values) {
        this.values = values;
    }

    @Override
    public Object cast(Class t) throws CastException {

        if (t.isAssignableFrom(DM_Array.class)) {
            return this;
        }

        ArrayList<Object> temp = new ArrayList<>();

        for (DM_Object value : values) {
            temp.add(value.cast(t));
        }
        return temp;
    }

    public double[] cast(double[] array) throws CastException {

        for (int i = 0; i < array.length; i++) {
            array[i] = (double) values.get(i).cast(Double.class);
        }
        return array;
    }

    public ArrayList<T> getValues() {
        return values;
    }

    public void add(T value) {
        values.add(value);
    }

    public T get(int i) {
        return values.get(i);
    }

    public int size() {
        return values.size();
    }

    @Override
    public DM_Array plus(DM_Object o) {

        if (o instanceof DM_Array) {

            DM_Array a = this;
            DM_Array b = (DM_Array) o;
            ArrayList<DM_Object> c = new ArrayList<>();

            if (a.size() != b.size()) {
                throw new UnsupportedOperationException("Two arrays of different sizes cannot be added one to another.");
            }
            for (int i = 0; i < values.size(); i++) {
                c.add(a.get(i).plus(b.get(i)));
            }
            return new DM_Array(c);
        } else {
            return plus(o.toArray(size()));
        }
    }

    @Override
    public DM_Array minus(DM_Object o) {

        if (o instanceof DM_Array) {

            DM_Array a = this;
            DM_Array b = (DM_Array) o;
            ArrayList<DM_Object> c = new ArrayList<>();

            if (a.size() != b.size()) {
                throw new UnsupportedOperationException("Two arrays of different sizes cannot be subtracted one from another.");
            }
            for (int i = 0; i < values.size(); i++) {
                c.add(a.get(i).minus(b.get(i)));
            }
            return new DM_Array(c);
        } else {
            return minus(o.toArray(size()));
        }
    }

    @Override
    public DM_Array times(DM_Object o) {

        if (o instanceof DM_Array) {

            DM_Array a = this;
            DM_Array b = (DM_Array) o;
            ArrayList<DM_Object> c = new ArrayList<>();

            if (a.size() != b.size()) {
                throw new UnsupportedOperationException("Two arrays of different sizes cannot be multiplied.");
            }
            for (int i = 0; i < values.size(); i++) {
                c.add(a.get(i).times(b.get(i)));
            }
            return new DM_Array(c);
        } else {
            return times(o.toArray(size()));
        }
    }

    @Override
    public DM_Array div(DM_Object o) {

        if (o instanceof DM_Array) {
            DM_Array a = this;
            DM_Array b = (DM_Array) o;
            ArrayList<DM_Object> c = new ArrayList<>();
            if (a.size() != b.size()) {
                throw new UnsupportedOperationException("Two arrays of different sizes cannot be divided.");
            }
            for (int i = 0; i < values.size(); i++) {
                c.add(a.get(i).div(b.get(i)));
            }
            return new DM_Array(c);
        } else {
            return div(o.toArray(size()));
        }
    }

    @Override
    public DM_Array pow(DM_Object o) {

        if (o instanceof DM_Array) {
            DM_Array a = this;
            DM_Array b = (DM_Array) o;
            ArrayList<DM_Object> c = new ArrayList<>();
            if (a.size() != b.size()) {
                throw new UnsupportedOperationException("Two arrays of different sizes cannot be powered.");
            }
            for (int i = 0; i < values.size(); i++) {
                c.add(a.get(i).pow(b.get(i)));
            }
            return new DM_Array(c);
        } else {
            return pow(o.toArray(size()));
        }
    }

    @Override
    public DM_Array lt(DM_Object o) {

        if (o instanceof DM_Array) {
            DM_Array a = this;
            DM_Array b = (DM_Array) o;
            ArrayList<DM_Object> c = new ArrayList<>();
            if (a.size() != b.size()) {
                throw new UnsupportedOperationException("Two arrays of different sizes cannot be compared.");
            }
            for (int i = 0; i < values.size(); i++) {
                c.add(a.get(i).lt(b.get(i)));
            }
            return new DM_Array(c);
        } else {
            return lt(o.toArray(size()));
        }
    }

    @Override
    public DM_Array gt(DM_Object o) {

        if (o instanceof DM_Array) {
            DM_Array a = this;
            DM_Array b = (DM_Array) o;
            ArrayList<DM_Object> c = new ArrayList<>();
            if (a.size() != b.size()) {
                throw new UnsupportedOperationException("Two arrays of different sizes cannot be compared.");
            }
            for (int i = 0; i < values.size(); i++) {
                c.add(a.get(i).gt(b.get(i)));
            }
            return new DM_Array(c);
        } else {
            return gt(o.toArray(size()));
        }
    }

    @Override
    public DM_Array eq(DM_Object o) {

        if (o instanceof DM_Array) {
            DM_Array a = this;
            DM_Array b = (DM_Array) o;
            ArrayList<DM_Object> c = new ArrayList<>();
            if (a.size() != b.size()) {
                throw new UnsupportedOperationException("Two arrays of different sizes cannot be compared.");
            }
            for (int i = 0; i < values.size(); i++) {
                c.add(a.get(i).eq(b.get(i)));
            }
            return new DM_Array(c);
        } else {
            return eq(o.toArray(size()));
        }
    }

    @Override
    public DM_Array<T> toArray(int size) {
        if (size() != size) {
            throw new UnsupportedOperationException("An array cannot be converted into an array of different size.");
        }
        return new DM_Array<>(values);
    }

    @Override
    public DM_Sample toSample() {
        throw new UnsupportedOperationException("An array cannot be converted into a sample.");
    }

    @Override
    public String toString() {
        String list = "";
        for (int i = 0; i < values.size(); i++) {
            list += values.get(i);
            list += i == values.size() - 1 ? "" : ",";
        }
        return "<" + list + ">";
    }
}
