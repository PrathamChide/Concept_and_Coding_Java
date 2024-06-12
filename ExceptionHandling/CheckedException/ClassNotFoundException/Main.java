package ExceptionHandling.CheckedException.ClassNotFoundException;

public class Main{
    public static void main(String[] args) throws ClassNotFoundException{
        method1();
    }
    public static void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
}