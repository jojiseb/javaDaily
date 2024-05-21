package SingletonTest;

public class SecondSingleton {
    private SecondSingleton() {
        System.out.println("Once...");
    }
    private static SecondSingleton secondSingleton;
    private static int singleCheck;

    public static SecondSingleton getInstanceBySecond() {
        if(secondSingleton == null) {
            secondSingleton = new SecondSingleton();
        }
        return secondSingleton;
    }
}
