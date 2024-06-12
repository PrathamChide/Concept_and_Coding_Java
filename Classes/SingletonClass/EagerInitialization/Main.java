package Classes.SingletonClass.EagerInitialization;

public class Main {
    public static void main(String[] args) {
        DBConnection connObj = DBConnection.getInstance();
    }
}
