package InterfaceInDepth.Java8_9Features.Private_PrivateStaticMethod;

public interface Bird {
    void canFly(); //equal to public abstract void canFly();
    public default void minimumFlyHeight(){
        myStaticPublicMethod(); //calling static method
        myPrivateMethod(); //calling private method
        myPrivateStaticMethod(); //calling private static method
    }
    static void myStaticPublicMethod(){
        myPrivateStaticMethod();;
    }
    private void myPrivateMethod(){
        //private method implementation
    }
    private static void myPrivateStaticMethod(){
        //private static method implementation
    }

}
