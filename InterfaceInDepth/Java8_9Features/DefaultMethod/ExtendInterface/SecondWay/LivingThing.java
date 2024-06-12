package InterfaceInDepth.Java8_9Features.DefaultMethod.ExtendInterface.SecondWay;

public interface LivingThing {
    default boolean canBreathe(){
        return true;
    }
}
