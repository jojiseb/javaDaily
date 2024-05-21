package SingletonTest;

public class Main {
    public static void main(String[] args) {
//        SingletonObj singletonObj = new SingletonObj(); --> Shows error since its private, can't access here

        SingletonObj singletonObj = SingletonObj.getSingletonInstance();

        SingletonObj singletonObj1 = SingletonObj.getSingletonInstance();

        SingletonObj singletonObj2 = SingletonObj.getSingletonInstance();   //All 3 references here point to same instance created once
    }     //Since, You can call the constructor, no new objects will be created.
         //Only 1 object created is by using static method, which is a controlled setup, creates it once and reference variables point to an object created once.
}
