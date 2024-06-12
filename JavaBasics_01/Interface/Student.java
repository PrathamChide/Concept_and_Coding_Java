package JavaBasics_01.Interface;

public class Student {
    public static void main(String[] args) {
        Person softwareEngineer = new Engineer();
        Person teacher = new Teacher();
        Teacher t1 = new Teacher();
        Engineer softwareEngineer1 = new Engineer();
        System.out.println(t1.profession());
        System.out.println(softwareEngineer1.profession());
    }
}
