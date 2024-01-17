package inheritance;

class SuperClass {
    void methodSuper() {
        System.out.println("Super class method..");
    }
}
public class SubClass extends SuperClass {
    void methodSub() {
        System.out.println("Sub class method...");
    }

    public static void main(String[] args) {
        SubClass sc = new SubClass();

        sc.methodSub();
        sc.methodSuper();
    }
}
