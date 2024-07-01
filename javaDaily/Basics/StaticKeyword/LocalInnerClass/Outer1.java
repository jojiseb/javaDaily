package LocalInnerClass;

public class Outer1 {

    private static int a = 10;
    private static String s = "same";

    int y = 9;

    void localInnerMethod() {

        s = "Okay"; //re-initialising a variable doesn't need to be effectively final

        String j = "I am J";

        y = 40; //re-initialising variables outside the method doesn't need to
            //be effectively final
        class LocalInner {

            void display() {
                System.out.println("Display from localInner !");
                System.out.println("a : "+a+", s : "+s );

                System.out.println("j : "+j);

                System.out.println("y : "+y);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.display();
    }

    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.localInnerMethod();
    }
}
