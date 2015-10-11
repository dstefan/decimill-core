package decimill.query;

import decimill.expression.Pointer;
import decimill.lang.DM_AssocArray;
import decimill.lang.DM_Object;
import java.util.HashMap;
import java.util.Map;

/**
 * @author David Stefan
 */
public class Memory {

    private final Map<String, DM_Object> map = new HashMap<>();

    public void assign(Pointer p, DM_Object o) {
        
        if (p.getField() == null) {
            assign(p.getId(), o);
        } else {
            assign(p.getId(), p.getField(), o);
        }
    }

    public void assign(String id, DM_Object o) {
        map.put(id, o);
    }

    public void assign(String id, String field, DM_Object o) {
        
        if (!map.containsKey(id)) {
            map.put(id, new DM_AssocArray());
        }
        
        DM_Object array = map.get(id);
        
        if (!(array instanceof DM_AssocArray)) {
            throw new UnsupportedOperationException("Cannot assign field to a non-aray variable.");
        }
        
        ((DM_AssocArray) array).put(field, o);
    }
    
    public DM_Object getAssigned(Pointer p) {
        
        if (!p.hasField()) {
            DM_Object o = map.get(p.getId());
            if (o == null) {
                throw new EvalVisitorException("Pointer '" + p + "' doesn't exist in this context.");
            }
            return o;
        }
        
        DM_Object o = map.get(p.getId());
        
        if (!(o instanceof DM_AssocArray)) {
            throw new UnsupportedOperationException("Cannot get field from a variable that isn't associative array");
        }
        
        DM_Object of = ((DM_AssocArray) o).get(p.getField());
        if (of == null) {
            throw new EvalVisitorException("Pointer '" + p + "' doesn't exist in this context.");
        }
        return of;
    }
}
