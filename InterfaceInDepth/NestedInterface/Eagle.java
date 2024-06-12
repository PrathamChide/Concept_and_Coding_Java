package InterfaceInDepth.NestedInterface;

public class Eagle implements Bird, Bird.NonFlyingBird{

    @Override
    public void canFly() {
        System.out.println("Fly");
    }

    @Override
    public void canRun(){
        System.out.println("Run");
    }
}
