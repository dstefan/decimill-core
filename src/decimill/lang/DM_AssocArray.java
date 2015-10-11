package decimill.lang;

import java.util.HashMap;
import java.util.Map;

/**
 * @author David Stefan
 * @param <T>
 */
public class DM_AssocArray<T extends DM_Object> extends DM_Array<T> {

    private final Map<String, Integer> labelsMap;
    private final Map<Integer, String> indicesMap;

    public DM_AssocArray() {
        this.labelsMap = new HashMap<>();
        this.indicesMap = new HashMap<>();
    }

    public void put(String key, T value) {
        if (labelsMap.containsKey(key)) {
            values.add(labelsMap.get(key), value);
        } else {
            values.add(value);
            indicesMap.put(values.size() - 1, key);
            labelsMap.put(key, values.size() - 1);
        }
    }

    public T get(String key) {
        //System.out.println(labelsMap);
        return values.get(labelsMap.get(key));
    }
    
    public T get(Integer index) {
        return values.get(index);
    }
    
    public Map<String, Integer> getLabelsMap() {
        return labelsMap;
    }

    @Override
    public String toString() {
        
        String list = "";
        int size = values.size();
        int counter = 0;
        
        for (int i = 0; i < values.size(); i++) {
            list += indicesMap.get(i) + ":" + values.get(i);
            list += size == ++counter ? "" : ",";
        }
        return "<" + list + ">";
    }
}
