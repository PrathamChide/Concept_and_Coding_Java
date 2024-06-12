package InterfaceInDepth.FunctionalInterface_LambdaExpression.HandleCases.UseCase1;

//Functional Interface extending Non-Functional Interface
@FunctionalInterface
public interface Bird extends LivingThing{
    void canFly(String val);
}
