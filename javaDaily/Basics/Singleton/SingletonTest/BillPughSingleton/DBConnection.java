package SingletonTest.BillPughSingleton;

public class DBConnection {

    private DBConnection() {
        System.out.println("Here...");
    }

    private static class InnerDBCollection {
        private static final DBConnection instance = new DBConnection();

    }
    public static DBConnection getInstance() {

        System.out.println(InnerDBCollection.instance);
        return InnerDBCollection.instance;
    }


}
