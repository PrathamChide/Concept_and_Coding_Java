package InterfaceInDepth.FunctionalInterface_LambdaExpression;

@FunctionalInterface
public interface Bird {
    void canFly();

    default void getHeight(){
        //implementation default method
    }

    static void canEat(){
        //implementation static method
    }

    String toString(); //Object Class Method
}
