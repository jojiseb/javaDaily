package SingletonTest;

public class GFG {
    public static void main(String[] args) {
        Singleton1 a = Singleton1.getInstance();

        Singleton1 b = Singleton1.getInstance();

        Singleton1 c = Singleton1.getInstance();

        System.out.println("Hashcode of a : "+a.hashCode());
        System.out.println("Hashcode of b : "+b.hashCode());
        System.out.println("Hashcode of c : "+c.hashCode());
    }
}
