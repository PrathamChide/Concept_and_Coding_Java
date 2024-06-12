package InterfaceInDepth.Java8_9Features.DefaultMethod.ExtendInterface.ThirdWay;

public interface Bird extends LivingThing{ //Child Interface
    default boolean canBreathe(){
        boolean canBreatheOrNot = LivingThing.super.canBreathe();
        return canBreatheOrNot;
    }
}
