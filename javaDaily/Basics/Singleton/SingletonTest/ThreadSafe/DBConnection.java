package SingletonTest.ThreadSafe;

public class DBConnection {
    static DBConnection instance;

    private DBConnection() {
        System.out.println("one");
    }
    public synchronized static DBConnection getInstance() {  //To make this method accessible outside since, there is no object
        if(instance == null) {              //to be created and then access it, We use static here
            instance = new DBConnection();
        }
        return instance;    //This works perfectly fine. Creates a single instance as expected. But reduces performance due to synchronized
                    //method. Because, We actually need it for first few threads which might create multiple instances.
            //So, It's creating an extra-overhead.

        //To avoid this scenario, we try to apply double-checked locking principle
    }
}
