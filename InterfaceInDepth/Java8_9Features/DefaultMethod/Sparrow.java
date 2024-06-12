package InterfaceInDepth.Java8_9Features.DefaultMethod;

public class Sparrow implements Bird{
    @Override
    public void canFly(){
        System.out.println("Sparrow fly");
    }
    @Override
    public int getMinimumFlyHeight(){
        return 100;
    }
}
