package SingletonTest.ThreadSafe_DoubleCheckLock;

public class DBConnection1 {
    private static DBConnection1 dbConnection1;

    private DBConnection1() {
        System.out.println("Hello");
    }
    public static DBConnection1 getInstance() {
        if(dbConnection1 == null) {
            synchronized (DBConnection1.class) {
                if(dbConnection1 == null) {
                    dbConnection1 = new DBConnection1();
                }
            }
        }
        return dbConnection1;
    }

}
