package JavaReflection.ReflectionOfMethods.InvokingMethodUsingReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        Class eagleClass = Class.forName("Eagle");
        Object eagleObject = eagleClass.newInstance();


//        Method flyMethod = eagleClass.getName("fly", int.class, boolean.class, String.class);
//        flyMethod.invoke(eagleObject, 1, true, "hello");
    }
}
