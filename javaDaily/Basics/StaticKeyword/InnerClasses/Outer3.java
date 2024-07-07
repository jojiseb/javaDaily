package InnerClasses;

public class Outer3 {
    private static int num = 3;
    private static String variable = "Inner Classes";

    class Inner {
        void display() {
            System.out.println("Number : "+num+", variable : "+variable);
        }
    }

    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        Inner inner = outer3.new Inner();

        inner.display();
    }
}
