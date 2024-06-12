package InterfaceInDepth.Java8_9Features.StaticMethod;

public class Eagle implements Bird{
    public void digestiveTest(){
        if(Bird.canBreathe()){
            System.out.println("Executed");
        }
    }
}
