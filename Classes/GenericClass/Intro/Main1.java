package Classes.GenericClass.Intro;

public class Main1 {
    public static void main(String[] args) {
        Print1<Integer> printObj1 = new Print1<>();
        printObj1.setValue(1);
        System.out.println(printObj1.getPrintValue());
    }
}
