package ExceptionHandling.CheckedException.ClassNotFoundException.try_Catch;

import java.io.FileNotFoundException;

public class Main1 {
    public static void main(String[] args) {
        try{
            method1("dummy");
        }
        catch (ClassNotFoundException | InterruptedException e){
            //handle it
        }
    }
    public static void method1(String name) throws ClassNotFoundException, InterruptedException {
        if(name.equals("dummy")){
            throw new ClassNotFoundException();
        } else if (name.equals("interrupted")) {
            throw new InterruptedException();
        }
    }
}
