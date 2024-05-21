package SingletonTest;

public class Singleton1 {
    private static Singleton1 single_instance = null;

    public String s;
    private Singleton1() {
        s = "I am part of singleton class";
    }

    public static synchronized Singleton1 getInstance() {
        if(single_instance == null) {
            single_instance = new Singleton1();
        }
        return single_instance;
    }
}
