package JavaBasics_01.Constructor.Overloading;

public class Calculation {
    String name;
    int empId;

    Calculation(String empName){
        name = empName;
        empId = 0;
    }

    Calculation(String empName, int empId){
        this.name = empName; //this refers to instance variable
        this.empId = empId;
    }
}
