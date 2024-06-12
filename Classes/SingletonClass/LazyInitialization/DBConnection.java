package Classes.SingletonClass.LazyInitialization;

public class DBConnection {
    public static DBConnection conObject;
    private DBConnection(){

    }
    public static DBConnection getInstance(){
        if(conObject == null){
            conObject = new DBConnection();
        }
        return conObject;
    }
}
