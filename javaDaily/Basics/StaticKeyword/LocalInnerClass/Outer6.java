package LocalInnerClass;

public class Outer6 {

    static String i = "I am apple"; //Field initialization happens first

    static { //static block is called 2nd
        System.out.println("Static block");
        System.out.println(" i : "+i);

        i = "Pineapple";
    }

    Outer6() { //constructor is called third
        System.out.println("Constructor...");

        System.out.println(" i : "+i);

        i = "Orange";
    }

    void innerMeth() {
//        static String p = "One test"; static members aren't accessible inside a method

        class InnerClass {
            private int num = 20;
//            static int i; Can't use static members in local inner class since, class is local
            InnerClass() {
                System.out.println("Inside constructor..");
                System.out.println("num : "+num);

                num = 30;
            }

            {
                System.out.println("inside instance initializer block..");
                System.out.println("num : "+num);
                num = 40;
            }

            void values() {
                System.out.println("Function call...");

                System.out.println("num : "+num);
            }
        }

        System.out.println("i : "+i);
        System.out.println();
        InnerClass ic = new InnerClass();
        ic.values();
    }

    public static void main(String[] args) {
        Outer6 out = new Outer6();
        out.innerMeth();
    }
}
