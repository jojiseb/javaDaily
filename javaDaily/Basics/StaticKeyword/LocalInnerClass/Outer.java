package LocalInnerClass;

public class Outer {
    private static String name = "Local Inner";
    int num = 80;
    void methodWithInnerClass() {
        int num = 20;

        class Inner {
            void display() {
                System.out.println("Name : "+name+", Number : "+num);
            }
        }

        System.out.println("Inside method..");
        Inner inner = new Inner();
        inner.display();
    }
    public static void main(String[] args) {
        System.out.println("In main..");
        Outer outer = new Outer();
        outer.methodWithInnerClass();
    }
}
