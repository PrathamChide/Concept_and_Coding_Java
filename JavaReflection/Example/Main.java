package JavaReflection.Example;

import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Class eagleClass = Eagle.class;
        System.out.println(eagleClass.getName());
        System.out.println(Modifier.toString(eagleClass.getModifiers()));
    }
}
