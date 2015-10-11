package decimill;

import decimill.lang.CastException;
import decimill.lang.DM_Array;
import decimill.lang.DM_Boolean;

/**
 * @author David Stefan
 */
public class DeciMill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CastException {

        DM_Array<DM_Array<DM_Boolean>> array = new DM_Array<>();
        DM_Array<DM_Boolean> bool = new DM_Array<>();
        bool.add(new DM_Boolean(true));
        bool.add(new DM_Boolean(false));
        array.add(bool);
        array.add(bool);

        System.out.println(array.cast(String.class));
    }
}
