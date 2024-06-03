package SingletonTest.Lazy;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Hii");
        ThirdDBConnection first = ThirdDBConnection.getInstance();
        ThirdDBConnection second = ThirdDBConnection.getInstance();
    }
}
