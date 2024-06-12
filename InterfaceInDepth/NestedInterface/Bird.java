package InterfaceInDepth.NestedInterface;

public interface Bird {
    public void canFly();
    public interface NonFlyingBird{
        public void canRun();
    }
}
