package Classes.Abstraction;

public abstract class LuxuryCar extends Car{
    LuxuryCar(int mileage){
        super(mileage);
    }
    public abstract void pressDualBreakSystem();

    @Override
    public void pressBreak() {
        //implementation goes here
    }
}
