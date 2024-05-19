package SingletonTest;

public class Main {
    public static void main(String[] args) {
//        SingletonObj singletonObj = new SingletonObj(); --> Shows error since its private, can't access here

        SingletonObj singletonObj = SingletonObj.getSingletonInstance();

        SingletonObj singletonObj1 = SingletonObj.getSingletonInstance();

        SingletonObj singletonObj2 = SingletonObj.getSingletonInstance();
    }
}
