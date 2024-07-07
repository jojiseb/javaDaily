package AnonymousClasses;

abstract class Test {
    abstract void method();
}

public class Outer_Class3 {
    public static void main(String[] args) {
        Test t = new Test() {
            @Override
            public void method() {
                System.out.println("Extending abstract class, implementing method..");
            }
        };

        t.method();
    }
}
