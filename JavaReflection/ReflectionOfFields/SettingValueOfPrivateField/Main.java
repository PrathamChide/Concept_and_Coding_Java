package JavaReflection.ReflectionOfFields.SettingValueOfPrivateField;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //Incorrect Way
//        Class eagleClass = Eagle.class;
//        Eagle eagleObj = new Eagle();
//        //Get both public & private fields with this
//        Field field = eagleClass.getDeclaredField("canSwim"); //private
//        field.set(eagleObj, true);

        //Correct Way
        Class eagleClass = Eagle.class;
        Eagle eagleObj = new Eagle();
        //get both public & private field with this.
        Field field = eagleClass.getDeclaredField("canSwim");
        field.setAccessible(true);
        field.set(eagleObj, true);
        if(field.getBoolean(eagleObj)){
            System.out.println("Value is set to true.");
        }
    }
}
