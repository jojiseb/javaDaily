package SingletonTest.Lazy;

public class FourthDBConnection {

    private static FourthDBConnection fourthDBConnection;
    private FourthDBConnection() {
        System.out.println("Lazy");
    }
    public static FourthDBConnection getInstance() {  //Singleton instance isn't created until its
        if(fourthDBConnection == null) {           //actually needed. You can free up the application
            fourthDBConnection = new FourthDBConnection(); //startUp time and improve overall performance when
        }                           //the instance isn't immediately necessary
        return fourthDBConnection;
        // Fails at multi-threading scenarios, more than one instance is created in lazy-initialization.
        //SO, It is not Thread-safe
        //So, To avoid it we synchronize the method
    }
}
