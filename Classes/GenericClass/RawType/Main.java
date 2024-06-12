package Classes.GenericClass.RawType;

public class Main {
    public static void main(String[] args) {
        Print<String> parameterizedTypePrintObject = new Print<>();
        //internally it passes object as parameterized type
        Print rawTypePrintObject = new Print();
        rawTypePrintObject.setPrintValue(1);
        System.out.println(rawTypePrintObject.getPrintValue());
    }
}
