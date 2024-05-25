package SingletonTest.Lazy;

public class LazyInitializationSecond {
    public static void main(String[] args) {
        SecondDBConnection secondDBConnection = SecondDBConnection.getInstance();

        SecondDBConnection secondDBConnection1 = SecondDBConnection.getInstance();

        System.out.println(secondDBConnection);
        System.out.println(secondDBConnection1);
    }
}
