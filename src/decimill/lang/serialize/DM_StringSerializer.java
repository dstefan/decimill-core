package decimill.lang.serialize;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import decimill.lang.DM_String;
import java.lang.reflect.Type;

/**
 * @author David Stefan
 */
public class DM_StringSerializer implements JsonSerializer<DM_String> {

    @Override
    public JsonElement serialize(DM_String t, Type type, JsonSerializationContext jsc) {
        return new JsonPrimitive(t.getValue());
    }

}
