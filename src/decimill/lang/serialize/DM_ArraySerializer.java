package decimill.lang.serialize;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import decimill.lang.DM_Array;
import java.lang.reflect.Type;

/**
 * @author David Stefan
 */
public class DM_ArraySerializer implements JsonSerializer<DM_Array> {

    @Override
    public JsonElement serialize(DM_Array t, Type type, JsonSerializationContext jsc) {
        return jsc.serialize(t.getValues());
    }

}
