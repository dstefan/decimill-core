package decimill.lang;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author David Stefan
 */
public class DM_SampleInfo extends DM_Object {

    private final Map<String, Object> data;
    
    public DM_SampleInfo() {
        this.data = new LinkedHashMap<>();
    }
    
    public Map<String, Object> getData() {
        return data;
    }
    
    public void set(String key, Object value) {
        data.put(key, value);
    }

    @Override
    public DM_Object plus(DM_Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DM_Object minus(DM_Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DM_Object times(DM_Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DM_Object div(DM_Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DM_Object pow(DM_Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DM_Object lt(DM_Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DM_Object gt(DM_Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DM_Object eq(DM_Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DM_Array toArray(int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public DM_Sample toSample() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String toString() {
        return "Sample";
    }
}
