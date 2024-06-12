package Classes.GenericClass.Inheritance.GenericSubClass;

public class Main {
    public static void main(String[] args) {
        ColorPrint<String> colorPrintObj = new ColorPrint<>();
        colorPrintObj.setPrintValue("Blue");
        System.out.println(colorPrintObj.getPrintValue());
    }
}
