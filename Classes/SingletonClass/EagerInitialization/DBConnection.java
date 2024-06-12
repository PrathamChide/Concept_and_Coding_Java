package Classes.SingletonClass.EagerInitialization;

public class DBConnection {
    private static DBConnection conObject = new DBConnection(); //Eager Initialization
    private DBConnection(){

    }
    public static DBConnection getInstance(){
        return conObject;
    }
}
