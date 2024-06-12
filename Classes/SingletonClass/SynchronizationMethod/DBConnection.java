package Classes.SingletonClass.SynchronizationMethod;

public class DBConnection {
    private static DBConnection connObject;
    private DBConnection(){

    }
    synchronized public static DBConnection getInstance(){
        if(connObject == null){
            connObject = new DBConnection();
        }
        return connObject;
    }
}
