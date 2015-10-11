package decimill.lang;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author David Stefan
 */
public class DM_Map extends DM_Object {
    
    private final Map<String, Object> data;
    
    public DM_Map() {
        this.data = new LinkedHashMap<>();
    }
    
    public void set(String key, Object value) {
        data.put(key, value);
    }
    
    public Object get(String key) {
        return data.get(key);
    }
    
    public Map<String, Object> getData() {
        return data;
    }

    @Override
    public DM_Object plus(DM_Object o) {
        throw new UnsupportedOperationException("Map addition not supported yet.");
    }

    @Override
    public DM_Object minus(DM_Object o) {
        throw new UnsupportedOperationException("Map subtraction not supported yet.");
    }

    @Override
    public DM_Object times(DM_Object o) {
        throw new UnsupportedOperationException("Map multiplication not supported yet.");
    }

    @Override
    public DM_Object div(DM_Object o) {
        throw new UnsupportedOperationException("Map division not supported yet.");
    }

    @Override
    public DM_Object pow(DM_Object o) {
        throw new UnsupportedOperationException("Map power not supported yet.");
    }

    @Override
    public DM_Object lt(DM_Object o) {
        throw new UnsupportedOperationException("Map comparison not supported yet.");
    }

    @Override
    public DM_Object gt(DM_Object o) {
        throw new UnsupportedOperationException("Map comparison not supported yet.");
    }

    @Override
    public DM_Object eq(DM_Object o) {
        throw new UnsupportedOperationException("Map comparison not supported yet.");
    }

    @Override
    public DM_Array toArray(int size) {
        throw new UnsupportedOperationException("Map coversion to array not supported yet.");
    }
    
    @Override
    public DM_Sample toSample() {
        throw new UnsupportedOperationException("Map cannot be converted to sample.");
    }
    
    @Override
    public String toString() {
        return "Chart";
    } 
}
