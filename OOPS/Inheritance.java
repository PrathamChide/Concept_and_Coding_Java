package OOPS;

class Vehicle{
    boolean hasEngine; //data variable
    boolean getEngine(){ //function
        return hasEngine;
    }
}

class Car1 extends Vehicle{
    String type;
    String getCarType(){
        return type;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.getEngine();
//        obj.getCarType(); // error -> Parent can't access child
        Car1 swift = new Car1();
        swift.getCarType();
        swift.getEngine(); // inherit from parent

    }
}


