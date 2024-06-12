package ExceptionHandling.UncheckedException.IndexOutOfBoundsException.ArrayIndexOutOfBoundsException;

public class Main {
    public static void main(String[] args) {
        int[] val = new int[2];
        System.out.println(val[3]);
    }
}
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
//at ExceptionHandling.UncheckedException.IndexOutOfBoundsException.ArrayIndexOutOfBoundsException.Main.main(Main.java:6)