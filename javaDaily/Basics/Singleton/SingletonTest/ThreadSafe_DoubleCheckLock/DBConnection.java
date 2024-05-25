package SingletonTest.ThreadSafe_DoubleCheckLock;

public class DBConnection {
    private static DBConnection instance;
    private DBConnection() {
        System.out.println("Hello");
    }
    public static DBConnection getInstance() {
//        if(instance == null) {
//            instance = new DBConnection();
//        }
//        return instance;

        if(instance == null) {  //first if to filter out initial threads
            synchronized(DBConnection.class) { //Multiple threads get synchronized here So, At a time single thread enter inside
                if(instance == null) {      //Another if since, the first entered thread creates an instance, so the
                    instance = new DBConnection();  //second thread can avoid executing this block
                }
            }
        }           //This is Double-Checked Locking principle
        return instance;
    }
}
