package decimill.lang.serialize;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import decimill.lang.DM_AssocArray;
import decimill.lang.DM_Object;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author David Stefan
 */
public class DM_AssocArraySerializer implements JsonSerializer<DM_AssocArray> {

    @Override
    public JsonElement serialize(DM_AssocArray t, Type type, JsonSerializationContext jsc) {
        
        JsonObject o = new JsonObject();
        ArrayList<DM_Object> values = t.getValues();
        Map<Integer, String> keysMap = t.getLabelsMap();
        
        for (int i = 0; i < values.size(); i++) {
            String key = keysMap.get(i);
            if (key == null) {
                o.add(i + "", jsc.serialize(values.get(i)));
            } else {
                o.add(keysMap.get(i), jsc.serialize(values.get(i)));
            }
        }
        
        return o;
    }

}
