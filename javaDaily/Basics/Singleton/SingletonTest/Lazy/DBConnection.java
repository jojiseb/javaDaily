package SingletonTest.Lazy;

public class DBConnection {
    private static DBConnection dbConnection; //Lazy initialization --> Object is created on demand in the method
    //default value of dbConnection is null
    private DBConnection() {

    }
    public static DBConnection getInstance() {
        if(dbConnection == null) { //to ensure only once is created or not
            dbConnection = new DBConnection(); //creating once
        }
        return dbConnection;    //return if exists
    }

    //Disadvantage of lazy, replace
}
