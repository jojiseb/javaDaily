package SingletonTest.ThreadSafe;

public class DBConnection1 {
    private static DBConnection1 dbConnection1;

    private DBConnection1() {

    }

    public static synchronized DBConnection1 getInstance() {
        if(dbConnection1 == null) {
            System.out.println("One");
            return dbConnection1 = new DBConnection1();
        }
        return dbConnection1;
    }
}
