package JavaBasics_01.Constructor.Chaining;

public class Manager extends Person{
//    Manager(){
//        super(); //Hidden - Internal Implementation
//        System.out.println("Inside manager constructor: no arg");
//    }
    int age;
    Manager(int empId, int age){
        super(empId); // initialized by parent constructor -> call parent constructor first and then child is executed
        this.age = age;
        System.out.println("Inside manager constructor: with arg");
    }
}
