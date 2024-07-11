package AnonymousClasses;

abstract class AbstractTest {
    abstract void display();
}

class TestA {
    AbstractTest a = new AbstractTest() {
        @Override
        public void display() {
            System.out.println("Test A display..");
        }
    };
    void f() {
        a.display();
    }
}

public class AnonymousLearn5 {
    public static void main(String[] args) {
        TestA t = new TestA();
        t.f();
    }
}
