package ExceptionHandling.UncheckedException.IllegalArgumentException;

public class Main {
    public static void main(String[] args) {
        int val = Integer.parseInt("abc");
    }
}
//Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"