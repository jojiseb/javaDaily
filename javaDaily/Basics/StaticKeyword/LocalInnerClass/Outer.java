package LocalInnerClass;

public class Outer {
    private static String name = "Local Inner";
    int num = 80;
    void methodWithInnerClass() {
        int num = 20; //Must be effectively final, since its a local variable
            //and concurrency issues must not occur

//    num = 90; So, Local variables accessed by Inner classes must be
//    effectively final -- means it must behave as if it is final (mustn't get modified)
//    after its declared

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
