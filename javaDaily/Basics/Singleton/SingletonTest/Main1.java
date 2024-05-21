package SingletonTest;

public class Main1 {
    public static void main(String[] args) {
//        SecondSingleton first = new SecondSingleton(); private, so can't access

        SecondSingleton first = SecondSingleton.getInstanceBySecond();

        SecondSingleton second = SecondSingleton.getInstanceBySecond();
    }
}
