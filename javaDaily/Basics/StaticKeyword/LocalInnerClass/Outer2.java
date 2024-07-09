package LocalInnerClass;

public class Outer2 {

    private static String q = "Qwerty";
    private static int w = 12;
    private String e = "CPU";
    private int r = 80;

    void one() {
        System.out.println("Item test");
    }

    static void f() {
        System.out.println("Static method");
    }

    void localInner() {
        class Checker { //Local Inner Class, defined inside a method
            //Since, It is defined inside a method, it can't have any access specifiers
            void nest() {
                System.out.println("Nested inside a method");
                one();
                f();

                System.out.println("q : "+q+", w : "+w+", e : "+e+", r : "+r);
            }
        }

        Checker ch = new Checker();
        ch.nest();
    }

    public static void main(String[] args) {
        Outer2 o = new Outer2();
        o.localInner();
    }
}
