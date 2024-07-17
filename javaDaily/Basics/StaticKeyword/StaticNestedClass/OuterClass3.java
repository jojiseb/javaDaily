package StaticNestedClass;

public class OuterClass3 {

    String a = "hello";

    static int b = 23;

    void display() {
        System.out.println("instance..");
    }

    static void print() {
        System.out.println("static method..");
    }

    static class Inner {

        void innerMethod() {
//            System.out.println(" a : "+a);  can't access non-static members of
//            display();  enclosing class inside static nested class

            System.out.println("b : "+b);
            print();
        }

        void accessInstance(OuterClass3 outer) {

            System.out.println(" a : "+outer.a); //Using outer class instance to
            outer.display();    //access non-static members
        }

        static void hello() {
            System.out.println("static hello...");
        }
    }

    public static void main(String[] args) {
        Inner i = new Inner(); //doesn't need outer class instance for nested class
        i.innerMethod(); //since its static and doesn't depend on outer class instance
        i.accessInstance(new OuterClass3());
        Inner.hello();
    }
}
