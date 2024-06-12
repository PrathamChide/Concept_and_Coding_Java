package InterfaceInDepth.Java8_9Features.DefaultMethod.ExtendInterface.ThirdWay;

public interface LivingThing { // Parent Interface
    default boolean canBreathe(){
        return true;
    }
}
