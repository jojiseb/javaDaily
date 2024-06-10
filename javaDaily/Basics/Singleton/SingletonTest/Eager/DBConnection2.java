package SingletonTest.Eager;

public class DBConnection2 {

    //In Eager Initialization,An instance is created at the time of class-loading

    //We won't have any thread-safety issue if we choose to use Eager initialization

    private DBConnection2() {
        System.out.println("private eager..");
    }

            //Eagerly initialised
    private static final DBConnection2 dbConnection2 = new DBConnection2();

    public static DBConnection2 getInstance() {
        return dbConnection2;
    }

}
