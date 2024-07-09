package StaticNestedClass;

public class OuterClass2 {

    private static String a = "One";
    private static int b = 20;
    private String c = "Three";
    private int d = 30;

    static void test() {
        System.out.println("Beep boop");
    }

    void beep() {
        System.out.println("No boop");
    }

    static class Inner {
        void one() {
            System.out.println("a : "+a);
            System.out.println("b : "+b);
//            System.out.println("c : "+c); Non-static members can't be accessed
//            System.out.println("d : "+d); from static context
//            beep();

            test();
        }
//      test(); //Won't work since java won't allow an executable code in class body
//      outside a method, static block or constructor
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.one();
        OuterClass2 o = new OuterClass2();
        o.beep();
        System.out.println("c : "+o.c+", d : "+o.d);
    }
}
