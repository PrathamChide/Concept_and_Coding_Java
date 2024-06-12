package ExceptionHandling.UserDefined;

public class Main {
    public static void main(String[] args) throws MyCustomException{
        try{
            method1();
        }
        catch (MyCustomException e){
            //handle it
        }
    }
    public static void method1() throws MyCustomException {
        throw new MyCustomException("some issue arise");
    }
}
