package InnerClasses;

public class Outer4 {

    private static String type = "Non-static";
    private static int one = 30;
    private String two = "Check";
    private int four = 50;

    private void test() {
        System.out.println("testing testing");
    }

    private static void hello() {
        System.out.println("Static hello");
    }

    class NonStatic {
        void display() {
            System.out.println("Type : "+type); //Able to access all type of vegetables
            System.out.println("One : "+one);
            System.out.println("Two : "+two);
            System.out.println("Four : "+four);
            test();
            hello();
        }
    }

    public static void main(String[] args) {
        Outer4 o = new Outer4();
        NonStatic n = o.new NonStatic();

        n.display();
    }
}
