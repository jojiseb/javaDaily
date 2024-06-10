package SingletonTest.ThreadSafe_DoubleCheckLock;

public class DBConnection1 {
    private static volatile DBConnection1 dbConnection1; //volatile keyword to avoid visibility issue --> If the variable
    //which is shared among multiple threads
    //Making it volatile means variable will read value from main memory each time and any change in value will
    //be communicated faster to other threads using sam variable without any delay
    private DBConnection1() {
        System.out.println("Hello");
    }
    public static DBConnection1 getInstance() {
        if(dbConnection1 == null) {
            synchronized (DBConnection1.class) {    //No more than 1 instance is created due to synchronized block
                if(dbConnection1 == null) {
                    dbConnection1 = new DBConnection1();
                }
            }
        }
        return dbConnection1;
    }

}
