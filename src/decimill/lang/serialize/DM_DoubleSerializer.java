package decimill.lang.serialize;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import decimill.lang.DM_Double;
import java.lang.reflect.Type;

/**
 * @author David Stefan
 */
public class DM_DoubleSerializer implements JsonSerializer<DM_Double> {

    @Override
    public JsonElement serialize(DM_Double t, Type type, JsonSerializationContext jsc) {
        return new JsonPrimitive(t.getValue());
    }

}
