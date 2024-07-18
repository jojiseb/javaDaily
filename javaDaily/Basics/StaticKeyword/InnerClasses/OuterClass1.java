package InnerClasses;

public class OuterClass1 {

    private class InnerC {
        void test() {
            System.out.println("Test Method..");
        }
    }
    public static void main(String[] args) {
        OuterClass1 o = new OuterClass1();
        InnerC i = o.new InnerC();

        i.test();
    }
}
