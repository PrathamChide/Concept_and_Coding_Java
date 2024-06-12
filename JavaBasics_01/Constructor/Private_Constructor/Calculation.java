package JavaBasics_01.Constructor.Private_Constructor;

public class Calculation {
    String name;
    int empId;
    private Calculation(){
        //Only this class has access to create the constructor of Calculation()
    }
//    Calculation(){
//
//    }
    public static Calculation getInstance(){
        //We have to make this method static as to access it using class name & we don't need to object for it.
        return  new Calculation();
    }
}
//Any Method outside this class, if they have to access the constructor they have to call the getInstance() method to
// access the constructor
