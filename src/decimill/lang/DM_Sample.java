package decimill.lang;

import java.util.ArrayList;

/**
 * @author David Stefan
 */
public class DM_Sample extends DM_Object {

    protected final ArrayList<DM_Double> values;

    public DM_Sample() {
        this.values = new ArrayList<>();
    }
    
    public DM_Sample(double value) {
        this();
        for (int i = 0; i < sampleSize; i++) {
            values.add(new DM_Double(value));
        }
    }

    public DM_Sample(ArrayList<DM_Double> values) {
        this.values = values;
    }
    
    @Override
    public Object cast(Class t) throws CastException {
        
        if (t.isAssignableFrom(DM_Sample.class)) {
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

    public ArrayList<DM_Double> getValues() {
        return values;
    }

    public void add(DM_Double value) {
        values.add(value);
    }

    public DM_Double get(int i) {
        return values.get(i);
    }
    
    public int size() {
        return values.size();
    }

    @Override
    public DM_Object plus(DM_Object o) {
        
        if (o instanceof DM_Array) {
            
            DM_Array b = (DM_Array) o;
            DM_Array<DM_Sample> a = this.toArray(b.size());
            DM_Array<DM_Object> c = new DM_Array<>();

            for (int i = 0; i < b.size(); i++) {
                c.add(a.get(i).plus(b.get(i).toSample()));
            }
            return c;
        } else if (o instanceof DM_Sample) {
            
            DM_Sample b = (DM_Sample) o;
            DM_Sample c = new DM_Sample();
            
            for (int i = 0; i < sampleSize; i++) {
                c.add((DM_Double) get(i).plus(b.get(i)));
            }
            return c;
        } else {
            return plus(o.toSample());
        }
    }
    
    @Override
    public DM_Object minus(DM_Object o) {
        
        if (o instanceof DM_Array) {
            
            DM_Array b = (DM_Array) o;
            DM_Array<DM_Sample> a = this.toArray(b.size());
            DM_Array<DM_Object> c = new DM_Array<>();

            for (int i = 0; i < b.size(); i++) {
                c.add(a.get(i).minus(b.get(i).toSample()));
            }
            return c;
        } else if (o instanceof DM_Sample) {
            
            DM_Sample b = (DM_Sample) o;
            DM_Sample c = new DM_Sample();
            
            for (int i = 0; i < sampleSize; i++) {
                c.add((DM_Double) get(i).minus(b.get(i)));
            }
            return c;
        } else {
            return minus(o.toSample());
        }
    }
    
    @Override
    public DM_Object times(DM_Object o) {
        
        if (o instanceof DM_Array) {
            
            DM_Array b = (DM_Array) o;
            DM_Array<DM_Sample> a = this.toArray(b.size());
            DM_Array<DM_Object> c = new DM_Array<>();

            for (int i = 0; i < b.size(); i++) {
                c.add(a.get(i).times(b.get(i).toSample()));
            }
            return c;
        }  else if (o instanceof DM_Sample) {
            
            DM_Sample b = (DM_Sample) o;
            DM_Sample c = new DM_Sample();
            
            for (int i = 0; i < sampleSize; i++) {
                c.add((DM_Double) get(i).times(b.get(i)));
            }
            return c;
        } else {
            return times(o.toSample());
        }
    }
    
    @Override
    public DM_Object div(DM_Object o) {
        
        if (o instanceof DM_Array) {
            
            DM_Array b = (DM_Array) o;
            DM_Array<DM_Sample> a = this.toArray(b.size());
            DM_Array<DM_Object> c = new DM_Array<>();

            for (int i = 0; i < b.size(); i++) {
                c.add(a.get(i).div(b.get(i).toSample()));
            }
            return c;
        }  else if (o instanceof DM_Sample) {
            
            DM_Sample b = (DM_Sample) o;
            DM_Sample c = new DM_Sample();
            
            for (int i = 0; i < sampleSize; i++) {
                c.add((DM_Double) get(i).div(b.get(i)));
            }
            return c;
        } else {
            return div(o.toSample());
        }
    }
    
    @Override
    public DM_Object pow(DM_Object o) {
        
        if (o instanceof DM_Array) {
            
            DM_Array b = (DM_Array) o;
            DM_Array<DM_Sample> a = this.toArray(b.size());
            DM_Array<DM_Object> c = new DM_Array<>();

            for (int i = 0; i < b.size(); i++) {
                c.add(a.get(i).pow(b.get(i).toSample()));
            }
            return c;
        }  else if (o instanceof DM_Sample) {
            
            DM_Sample b = (DM_Sample) o;
            DM_Sample c = new DM_Sample();
            
            for (int i = 0; i < sampleSize; i++) {
                c.add((DM_Double) get(i).pow(b.get(i)));
            }
            return c;
        } else {
            return pow(o.toSample());
        }
    }
    
    @Override
    public DM_Object lt(DM_Object o) {
        
        if (o instanceof DM_Array) {
            
            DM_Array b = (DM_Array) o;
            DM_Array<DM_Sample> a = this.toArray(b.size());
            DM_Array<DM_Object> c = new DM_Array<>();

            for (int i = 0; i < b.size(); i++) {
                c.add(a.get(i).lt(b.get(i).toSample()));
            }
            return c;
        }  else if (o instanceof DM_Sample) {
            
            DM_Sample b = (DM_Sample) o;
            DM_Sample c = new DM_Sample();
            
            for (int i = 0; i < sampleSize; i++) {
                c.add((DM_Double) get(i).lt(b.get(i)).cast(DM_Double.class));
            }
            return c;
        } else {
            return lt(o.toSample());
        }
    }
    
    @Override
    public DM_Object gt(DM_Object o) {
        
        if (o instanceof DM_Array) {
            
            DM_Array b = (DM_Array) o;
            DM_Array<DM_Sample> a = this.toArray(b.size());
            DM_Array<DM_Object> c = new DM_Array<>();

            for (int i = 0; i < b.size(); i++) {
                c.add(a.get(i).gt(b.get(i).toSample()));
            }
            return c;
        }  else if (o instanceof DM_Sample) {
            
            DM_Sample b = (DM_Sample) o;
            DM_Sample c = new DM_Sample();
            
            for (int i = 0; i < sampleSize; i++) {
                c.add((DM_Double) get(i).gt(b.get(i)).cast(DM_Double.class));
            }
            return c;
        } else {
            return gt(o.toSample());
        }
    }
    
    @Override
    public DM_Object eq(DM_Object o) {
        
        if (o instanceof DM_Array) {
            
            DM_Array b = (DM_Array) o;
            DM_Array<DM_Sample> a = this.toArray(b.size());
            DM_Array<DM_Object> c = new DM_Array<>();

            for (int i = 0; i < b.size(); i++) {
                c.add(a.get(i).eq(b.get(i).toSample()));
            }
            return c;
        }  else if (o instanceof DM_Sample) {
            
            DM_Sample b = (DM_Sample) o;
            DM_Sample c = new DM_Sample();
            
            for (int i = 0; i < sampleSize; i++) {
                c.add((DM_Double) get(i).eq(b.get(i)).cast(DM_Double.class));
            }
            return c;
        } else {
            return eq(o.toSample());
        }
    }

    @Override
    public DM_Array<DM_Sample> toArray(int size) {
        
        DM_Array<DM_Sample> array = new DM_Array();
        
        for (int i = 0; i < size; i++) {
            array.add(this);
        }
        return array;
    }
    
    @Override
    public DM_Sample toSample() {
        return this;
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
