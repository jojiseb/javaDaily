package SingletonTest.Lazy;

public class DBConnection {
    private static DBConnection dbConnection; //Lazy initialization --> Object is created on demand in the method
    //default value of dbConnection is null

    private  static int count;
    private DBConnection() {
//        System.out.println("Created");
    }
    public static DBConnection getInstance() {
        if (dbConnection == null) { //to ensure only once is created or not
            dbConnection = new DBConnection(); //creating once
        }
        return dbConnection;
    }

    //Disadvantage of lazy is that, what if dbConnection is null and
    //2 threads come in parallel ???

    //Both are null and will successfully enter if block, and create 2 objects
    //instead of one

    //So, It fails in a multi-threading setup

    //To solve this, we use synchronized method
}
