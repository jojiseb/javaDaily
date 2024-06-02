package SingletonTest.Eager;

public class DBConnection1 {

    private static DBConnection1 dbConnection1 = new DBConnection1(); //Object gets created eagerly in advance.
    private DBConnection1() {   //Made private since only a single object must be created, which is created and provided
        System.out.println("Only 1"); //by class itself
    }
        //Main disadvantage is that even if none needs the object, it gets created
    public static DBConnection1 getInstance() {
        return dbConnection1;
    }               //To tackle this Lazy Initialization is considered
}
