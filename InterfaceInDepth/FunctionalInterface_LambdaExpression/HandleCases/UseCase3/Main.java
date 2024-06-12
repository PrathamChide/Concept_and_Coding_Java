package InterfaceInDepth.FunctionalInterface_LambdaExpression.HandleCases.UseCase3;

public class Main {
    public static void main(String[] args) {
        Bird eagle = () -> true;
        System.out.println(eagle.canBreathe());
    }
}
