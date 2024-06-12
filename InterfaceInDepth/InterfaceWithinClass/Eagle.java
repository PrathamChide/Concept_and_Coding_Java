package InterfaceInDepth.InterfaceWithinClass;

public class Eagle implements Bird.NonFlyingBird{
    @Override
    public void canRun(){
        System.out.println("Run");
    }
}
