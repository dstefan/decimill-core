package decimill.lang.serialize;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import decimill.lang.DM_Integer;
import java.lang.reflect.Type;

/**
 * @author David Stefan
 */
public class DM_IntegerSerializer implements JsonSerializer<DM_Integer> {

    @Override
    public JsonElement serialize(DM_Integer t, Type type, JsonSerializationContext jsc) {
        return new JsonPrimitive(t.getValue());
    }

}
