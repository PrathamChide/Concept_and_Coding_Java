package JavaBasics_01;

class Employee{
    int memberVariable; //member or instance variable
    static int staticVariable = 100; //static variable or class variable
    Employee(){
        //default constructor
    }
    Employee(int a){
        //parameterised constructor
    }
    public void dummyMethod(){
        byte localVariable = 100; //local variable
        System.out.println(localVariable);
    }
}
public class Variables {
    public static void main(Strings[] args) {
        Employee e1 = new Employee();
        e1.dummyMethod();
        System.out.print(Employee.staticVariable);

    }
}
