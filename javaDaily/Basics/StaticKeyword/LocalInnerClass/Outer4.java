package LocalInnerClass;

public class Outer4 {
    private String outerField = "OuterField";
    private static int num = 100;
    void outer1() {
        System.out.println("Instance outer");
    }
    static void outerTest() {
        System.out.println("Outer Test Item");
    }

    void localInnerMethod() {
        String local = "Local";

        class LocalInner1 { //defined within a block of code i.e., a method here ...So, Can be instantiated here only
            void localInner() {
                System.out.println("Outer Field : "+outerField);
                outer1();

                outerTest();
                System.out.println("Num : "+num);
            }

//            static int number = 34; static declarations/methods aren't allowed

//            static void testStatic() {
//                System.out.println("test static");
//            }

        } //Lifecycle of local inner class exists within this block.
        //Usage of static ,members means it doesn't belong to a particular instance but rather to a class
        //So, There is conflict in scope
        LocalInner1 localInner1 = new LocalInner1();
        localInner1.localInner();
    }
    public static void main(String[] args) {
        Outer4 outer4 = new Outer4();
        outer4.localInnerMethod();
    }
}
