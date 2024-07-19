package LocalInnerClass;

public class Outer5 {
    String q = "Word";

    { //Called first
        System.out.println("q : "+q);
        q  = "initialization blocks";
        System.out.println("I got called...");
    }

    Outer5() { //Called after Instance initializer block is called

        System.out.println(" q : "+q);
        System.out.println("Constructor..");
        q  = "re-test";
    }

    public void inner() {
        class Inner {
            void innerMethod() {
                System.out.println("q : "+q);
                System.out.println("Inner Method....");
            }

        }

        Inner i = new Inner();
        i.innerMethod();
    }

    public static void main(String[] args) {
        Outer5 o = new Outer5(); //On every object invocation, instance initializer block is called
        o.inner();      //first and then the constructor is called
        System.out.println();
        new Outer5();
    }
}
