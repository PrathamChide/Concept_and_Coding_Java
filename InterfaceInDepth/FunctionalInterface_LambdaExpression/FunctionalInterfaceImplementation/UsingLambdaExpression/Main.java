package InterfaceInDepth.FunctionalInterface_LambdaExpression.FunctionalInterfaceImplementation.UsingLambdaExpression;

public class Main {
    public static void main(String[] args) {
        Bird eagleObj = (String value) -> {
            System.out.println("Eagle Implements");
        };
        eagleObj.canFly("vertical");
    }
}
