package decimill.lang;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import decimill.lang.serialize.DM_ArraySerializer;
import decimill.lang.serialize.DM_AssocArraySerializer;
import decimill.lang.serialize.DM_BooleanSerializer;
import decimill.lang.serialize.DM_DoubleSerializer;
import decimill.lang.serialize.DM_IntegerSerializer;
import decimill.lang.serialize.DM_StringSerializer;
import java.util.Map;

/**
 * @author David Stefan
 */
public class MapSerializer {

    public static String toJson(Map<String, Object> map) {

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(DM_Integer.class, new DM_IntegerSerializer());
        gsonBuilder.registerTypeAdapter(DM_Double.class, new DM_DoubleSerializer());
        gsonBuilder.registerTypeAdapter(DM_Array.class, new DM_ArraySerializer());
        gsonBuilder.registerTypeAdapter(DM_Boolean.class, new DM_BooleanSerializer());
        gsonBuilder.registerTypeAdapter(DM_String.class, new DM_StringSerializer());
        gsonBuilder.registerTypeAdapter(DM_AssocArray.class, new DM_AssocArraySerializer());
        Gson gson = gsonBuilder.create();
        
        return gson.toJson(map);
    }
}
