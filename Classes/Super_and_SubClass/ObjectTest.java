package Classes.Super_and_SubClass;

import Classes.Abstraction.Audi;

public class ObjectTest {
    public static void main(String[] args) {
        ObjectTest obj = new ObjectTest();
        Object obj1 = new Person();
        Object obj2 = new Audi(55);
        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());
        System.out.println(obj.getClass());
    }
}
