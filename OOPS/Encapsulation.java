package OOPS;

class Dog{
    String color; // data member

    String getDogColor(){
        return color;
    }

    void setColor() {
        setColor(null);
    }

    void setColor(String color){
        this.color = color;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Dog rottweiler = new Dog();
        rottweiler.setColor("Black");
        System.out.println(rottweiler.getDogColor());
    }
}
