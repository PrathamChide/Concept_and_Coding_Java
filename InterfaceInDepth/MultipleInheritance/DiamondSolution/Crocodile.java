package InterfaceInDepth.MultipleInheritance.DiamondSolution;

public class Crocodile implements LandAnimal, WaterAnimal{
    @Override
    public boolean canBreathe(){
        return true;
    }
}
