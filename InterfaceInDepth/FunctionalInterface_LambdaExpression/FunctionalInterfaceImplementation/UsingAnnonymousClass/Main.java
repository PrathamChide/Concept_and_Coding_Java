package InterfaceInDepth.FunctionalInterface_LambdaExpression.FunctionalInterfaceImplementation.UsingAnnonymousClass;

public class Main {
    public static void main(String[] args) {
        Bird eagleObj = new Bird() {
            @Override
            public void canFly(String val) {
                System.out.println(val);
            }
        };
        eagleObj.canFly("vertical");
    }
}
