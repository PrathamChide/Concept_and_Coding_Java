package InterfaceInDepth.FunctionalInterface_LambdaExpression.TypesOfFunctionalInterface.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> isEvenNumber = () -> {
            return "this is the data I am returning";
        };
        System.out.println(isEvenNumber.get());
    }
}
