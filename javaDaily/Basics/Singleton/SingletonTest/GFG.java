package SingletonTest;

public class GFG {
    public static void main(String[] args) {
        Singleton1 a = Singleton1.getInstance();

        Singleton1 b = Singleton1.getInstance();

        Singleton1 c = Singleton1.getInstance();

        System.out.println("Hashcode of a : "+a.hashCode());
        System.out.println("Hashcode of b : "+b.hashCode());
        System.out.println("Hashcode of c : "+c.hashCode());

        if(a == b && b == c) {
            System.out.println("3 objects point to same m/y location i.e., to same object");
        }
        else {
            System.out.println("These objects to ame memory location i scheme");
        }
    }
}
