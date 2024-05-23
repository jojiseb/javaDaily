package SingletonTest.Lazy;

public class LazyInitializationSecond {
    public static void main(String[] args) {
        SecondDBConnection secondDBConnection = SecondDBConnection.getInstance();

        SecondDBConnection secondDBConnection1 = SecondDBConnection.getInstance();

        if(secondDBConnection.hashCode() == secondDBConnection1.hashCode()) {
            System.out.println("Same Objects");
        }
        else {
            System.out.println("Different Objects");
        }
    }
}
