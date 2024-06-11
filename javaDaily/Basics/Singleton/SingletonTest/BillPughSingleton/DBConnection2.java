package SingletonTest.BillPughSingleton;

public class DBConnection2 {

    private DBConnection2() {
        System.out.println("created..");
    }
    private static class Inner {
        private static final DBConnection2 dbConnection2 = new DBConnection2();
    }

    public static DBConnection2 getInstance() {
        return Inner.dbConnection2;
    }
}
