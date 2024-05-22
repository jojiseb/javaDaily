package SingletonTest.Eager;

public class DBConnection {
    //I don't want anybody to access it apart from this class, so made private
    private static DBConnection dbConnection = new DBConnection(); //Eager initialization --> Something is already created in memory
    //even if none outside called it, because of static

    //Disadvantage of Eager ----------->  if there is no use, the object created eagerly anyways

    //To avoid this, we try to use Lazy initialization

    //Initialized early --> Object is created eagerly , in advanced.
    //Object belongs to the class here (static), no external classes can access it
    private DBConnection() { //Constructor is private, to avoid creation of new Object using new keyword
        System.out.println("I am here");        //basically, a new DB connection outside of this class must not be created
    }
    public static DBConnection getInstance() {
        return dbConnection;
    }
}