package Classes.GenericClass.Intro;

public class Main {
    public static void main(String[] args) {
        Print obj1 = new Print();
        obj1.setPrintValue(1);
        Object printValue = obj1.getPrintValue();
// We cannot use print value directly, we have to typecast it, else it will be compile time error
        if((int)printValue == 1){
            //do something
        }
    }
}
/*Here we don't know Object belongs to which class which is the major problem.
* In the above case we had to typecast the printValue. So generic helps us with this.
* */