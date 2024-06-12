package ExceptionHandling.UncheckedException.IndexOutOfBoundsException.StringIndexOutOfBoundsException;

public class Main {
    public static void main(String[] args) {
        String val = "heloo";
        System.out.println(val.charAt(5));
    }
}
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 5 out of bounds for length 5
//at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
//at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
//at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
//at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
//at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
//at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
//at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
//at java.base/java.lang.String.checkIndex(String.java:4881)
//at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:46)
//at java.base/java.lang.String.charAt(String.java:1582)
//at ExceptionHandling.UncheckedException.IndexOutOfBoundsException.StringIndexOutOfBoundsException.Main.main(Main.java:6)

