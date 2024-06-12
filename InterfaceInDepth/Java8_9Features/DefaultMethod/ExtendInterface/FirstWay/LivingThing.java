package InterfaceInDepth.Java8_9Features.DefaultMethod.ExtendInterface.FirstWay;

public interface LivingThing {
    default boolean canBreathe(){
        return true;
    }
}
