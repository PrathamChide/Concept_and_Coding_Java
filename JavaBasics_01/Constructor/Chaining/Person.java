package JavaBasics_01.Constructor.Chaining;

public class Person {
//    Person(){
//        System.out.println("This in person class: no arg");
//    }
    int empId;
    Person(int empId){
        this.empId = empId;
        System.out.println("this in person class: arg");
    }
}
