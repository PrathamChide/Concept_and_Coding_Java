package Classes.GenericClass.BoundedGenerics.UpperBound;

public class Main {
    public static void main(String[] args) {
        Print<Integer> obj = new Print<>();
        obj.setPrintValue(5);
        System.out.println(obj.getPrintValue());
    }
}
