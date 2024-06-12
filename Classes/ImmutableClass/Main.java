package Classes.ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> petNames = new ArrayList<>();
        petNames.add("Bob");
        petNames.add("Oggy");

        MyImmutableClass obj = new MyImmutableClass("myName", petNames);
        obj.getPetNameList().add("hello");
        System.out.println(obj.getPetNameList());
    }
}
