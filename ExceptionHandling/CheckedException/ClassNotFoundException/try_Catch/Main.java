package ExceptionHandling.CheckedException.ClassNotFoundException.try_Catch;

public class Main {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        try{
           throw new ClassNotFoundException();
        } catch (ClassNotFoundException exceptionObject){
            //handle this exception scenario like logging
            exceptionObject.printStackTrace();
        }
    }
}
