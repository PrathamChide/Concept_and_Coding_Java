package JavaReflection.ReflectionOfFields.SettingValueOfPublicField;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Class eagleClass = Eagle.class;
        Eagle eagleObj = new Eagle();
        //Get both public & private fields with this
        Field field = eagleClass.getDeclaredField("breed");
        field.set(eagleObj, "eagleBrainBreed");
        System.out.println(eagleObj.breed);

    }
}
