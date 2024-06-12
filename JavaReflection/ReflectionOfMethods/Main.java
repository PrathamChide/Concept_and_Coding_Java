package JavaReflection.ReflectionOfMethods;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class eagleClass = Eagle.class;
        Method[] methods = eagleClass.getMethods();
        for(Method method: methods){
            System.out.println("Method Name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType());
            System.out.println("Class Name: " + method.getDeclaringClass());
            System.out.println("*******");
        }
    }
}
