package JavaReflection.ReflectionOfFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main1 {
    public static void main(String[] args) {
        Class eagleClass = Eagle.class;
        //Get both public & private fields with this
        Field[] fields = eagleClass.getDeclaredFields();
        for(Field field: fields){
            System.out.println("FieldName: " + field.getName());
            System.out.println("Type: " + field.getType());
            System.out.println("Modifier: " + Modifier.toString(field.getModifiers()));
            System.out.println("******");
        }
    }
}
