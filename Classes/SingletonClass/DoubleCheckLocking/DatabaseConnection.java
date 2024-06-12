package Classes.SingletonClass.DoubleCheckLocking;

public class DatabaseConnection {
    private static volatile DatabaseConnection conObject;

    private DatabaseConnection(){

    }
    public static DatabaseConnection getInstance(){
        if(conObject == null){
            synchronized (DatabaseConnection.class){
                if(conObject == null){
                    conObject = new DatabaseConnection();
                }
            }
        }
        return conObject;
    }
}
