package decimill;

import decimill.lang.DM_Object;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author David Stefan
 */
public abstract class Function {

    public DM_Object invoke(String id, ArrayList<Object> params) throws FunctionInvocationException {
        
        Object[] paramsArray = params.toArray();
        Class<?>[] passedTypes = new Class[paramsArray.length];
        
        for (int i = 0; i < paramsArray.length; i++) {
            passedTypes[i] = paramsArray[i].getClass();
        }

        Method methodToExecute = null;
        Method[] declaredMethods = this.getClass().getDeclaredMethods();
        
        for (Method method : declaredMethods) {
            
            Class<?>[] declaredTypes = method.getParameterTypes();

            if (declaredTypes.length == passedTypes.length) {
                
                boolean methodFound = true;
                
                // Check passed types against declared types
                for (int i = 0; i < declaredTypes.length; i++) {
                    // Is passed type subclass of declared type?
                    if (!declaredTypes[i].isAssignableFrom(passedTypes[i])) {
                        methodFound = false;
                        break;
                    }
                }
                
                // Signature types match passed types
                if (methodFound) {
                    methodToExecute = method;
                    break;
                }
            }
        }

        // Throw exception if matching method hasn't been found
        if (methodToExecute == null) {
            String typesList = "";
            for (int i = 0; i < passedTypes.length; i++) {
                typesList += passedTypes[i].getSimpleName();
                typesList += i == passedTypes.length - 1 ? "" : ", ";
            }
            throw new FunctionInvocationException("Function " + id + "(" + typesList + ") doesn't exist.");
        }

        DM_Object res = null;

        try {
            methodToExecute.setAccessible(true);
            res = (DM_Object) methodToExecute.invoke(this, paramsArray);
        } catch (IllegalAccessException | InvocationTargetException e) {
            String cause = "";
            if (e.getMessage() == null) {
                cause = e.getCause().getMessage();
            } else {
                cause = e.getMessage();
            }
            throw new FunctionInvocationException("Calling function '" + id + "' didn't end well. " + cause + ". Are all parameters correct?");
        }

        return res;
    }
}
