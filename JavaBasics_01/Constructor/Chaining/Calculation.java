package JavaBasics_01.Constructor.Chaining;

public class Calculation {
    String name;
    int empId;
    Calculation(){
        this(10);
    }
    Calculation(int empId){
        this("sj", empId);
    }
    Calculation(String name, int empId){
        this.name = name;
        this.empId = empId;
    }
}
