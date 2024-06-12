package Classes.Abstraction;

public class Main {
    public static void main(String[] args) {
//        Note: We cannot create instance of this class: new Car()
        Car obj = new Audi(55);
        System.out.println(obj.mileage);
    }
}
