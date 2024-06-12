package JavaReflection.ReflectionOfMethods;

import java.lang.reflect.Method;

public class Main1 {
    public static void main(String[] args) {
        Class eagleClass = Eagle.class;
        Method[] methods = eagleClass.getDeclaredMethods(); // All public & private methods it will return with eagleClass Only
        for(Method method: methods){
            System.out.println("MethodName: " + method.getName());
        }
    }
}
