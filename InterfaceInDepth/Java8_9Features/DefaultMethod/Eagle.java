package InterfaceInDepth.Java8_9Features.DefaultMethod;

public class Eagle implements Bird{
    @Override
    public void canFly(){
        System.out.println("Eagle fly");
    }
    @Override
    public int getMinimumFlyHeight(){
        return 100;
    }
}
