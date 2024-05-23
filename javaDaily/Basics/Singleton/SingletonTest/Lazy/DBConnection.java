package SingletonTest.Lazy;

public class DBConnection {
    private static DBConnection dbConnection; //Lazy initialization --> Object is created on demand in the method
    //default value of dbConnection is null

    private  static int count;
    private DBConnection() {

    }
    public static DBConnection getInstance() {
//        if(dbConnection == null) { //to ensure only once is created or not
//            dbConnection = new DBConnection(); //creating once
////            System.out.println("Count : "+(count++));
//            System.out.println("Count : "+(++count));
//        }

        if(dbConnection == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            dbConnection = new DBConnection();
        }
        return dbConnection;    //return if exists
    }

    //Disadvantage of lazy is that, what if dbConnection is null and
    //2 threads come in parallel ???

    //Both are null and will successfully enter if block, and create 2 objects
    //instead of one

    //To solve this, we use synchronized method
}
