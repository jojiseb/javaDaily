package InnerClasses;

public class NonStaticNested {
    int q = 90;
    String w = "Non-static Nested Classes";
    private static int e = 2;
    void test() {
        System.out.println("Instance test in enclosing");
    }
    static void test1() {
        System.out.println("static test in enclosing");
    }

    class Inner1 {
//        String q = "I am a String";
        int w = 1;

//        static String e = "eeeeeee"; can't  make static declarations inside inner class
        //or nested class

        //Since, Inner class is itself associated with outer class instance, it cannot define any static
        //members itself

        String e = "eeeeeeeeee";

//        void test() {
//            System.out.println("inner instance test");
//        }

        void test1() {
            System.out.println("inner instance 2");
        }


        void displayInner() { //Local members shadowed enclosing class members
            System.out.println("q : "+q+", w : "+w+", e : "+e);
            test();
            test1();
        }
    }

    public static void main(String[] args) {
//        Inner1 inner1 = new Inner1(); can't access inner class or non-static nested
        //class from a static context.

        //Inner class is inherently referenced to Outer class instance

        NonStaticNested ns = new NonStaticNested(); //Outer class is instantiated first
        Inner1 i = ns.new Inner1(); //Shows inner class instance dependency to outer class instance

        i.displayInner();

    }
}
