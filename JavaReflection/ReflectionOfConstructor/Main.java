package JavaReflection.ReflectionOfConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Class eagleClass = Eagle.class;
        //to access private constructor too
        Constructor[] eagleConstructorList = eagleClass.getDeclaredConstructors();
        for(Constructor eagleConstructor: eagleConstructorList){
            System.out.println("Modifier: " + Modifier.toString(eagleConstructor.getModifiers()));
            eagleConstructor.setAccessible(true);
            Eagle eagleObj = (Eagle) eagleConstructor.newInstance();
            eagleObj.fly();
        }
    }
}
