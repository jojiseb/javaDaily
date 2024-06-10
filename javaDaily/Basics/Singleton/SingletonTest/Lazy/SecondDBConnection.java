package SingletonTest.Lazy;

public class SecondDBConnection {
    private static SecondDBConnection instance;
    private SecondDBConnection() {

    }
    public static SecondDBConnection getInstance() {    //Lazily initializing object in method, only when required
        if(instance == null) {  //Works as expected, single object is created when using in single-threaded envt.
            instance = new SecondDBConnection();    //Things go south when applied to multi-threaded envt. Multiple objects
        }   //gets created instead of single object if multiple threads inside if block at same time.
        return instance;
        //Therefore, Singleton Pattern is destroyed and both threads get different instances of Singleton Class
    }
}
