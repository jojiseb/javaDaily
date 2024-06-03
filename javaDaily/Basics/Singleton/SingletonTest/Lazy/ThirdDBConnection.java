package SingletonTest.Lazy;

public class ThirdDBConnection {
    private static ThirdDBConnection thirdDBConnection;

    private ThirdDBConnection() {

    }

    public static ThirdDBConnection getInstance() {
        if(thirdDBConnection == null) {
            thirdDBConnection = new ThirdDBConnection();
        }
        return thirdDBConnection;
    }
}
