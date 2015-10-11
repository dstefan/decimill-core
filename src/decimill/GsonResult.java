package decimill;

import java.util.Map;

/**
 * @author David Stefan
 */
public class GsonResult {

    private final Map<String, Object> data;
    
    public GsonResult(Map<String, Object> data) {
        this.data = data;
    }
    
    public Object get(String key) {
        return data.get(key);
    }
}
