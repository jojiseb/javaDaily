package InnerClasses;

public class Outer2 {

    private String type = "Non-static Inner classes";

    private int num = 10;

    int a = 20;

    String h = "test";

    void outer() {
        System.out.println("Instance method");
    }

    static void test2() {
        System.out.println("Static method");
    }

    class Inner {
        String test = "Inner instance variable";
        void inside() {
            System.out.println("Inside method..");
        }

//        static void it() { causes error as non-static class object is itself dependent on
        // outer class instance. Adding a static member ,
        // which means defining class-level data that needs to be shared across all inner class instances, independent of a specific outer class
        //instance.
        //which each is specifically depending on outer class instance.
//
//        }

        void inner() { //Non-static inner classes can access all members, including static, non-static of
                    //outer class
            test2();
            outer();
            System.out.println("Type : "+type+", Num : "+num+", a : "+a+", h : "+h);

            System.out.println("Test : "+test);
            inside();
        }
    }

    public static void main(String[] args) {
        Outer2 outer2 = new Outer2(); //Need to instantiate outer class instance first.
        Inner i = outer2.new Inner(); //As outer class instance is needed in order to
                                    //define an instance of inner class
        System.out.println("Test : "+i.test);
        i.inside();
        i.inner();

        //Why do non-static inner classes need an outer class instance to exists ??

        //That's how the member inner class instance holds a reference to outer class instance

        //The inner class is said to be non-static, means each inner class instance is associated with
        //an outer class instance.

        //outer2.new Inner() --> shows the reference of inner class instance to outer class instance
    }
}
