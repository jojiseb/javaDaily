package AnonymousClasses;


interface A {
    public void first();

}

class Alphabets {
    public void test() {
        A a = new A() {
            public void first() {
                System.out.println("Many test");
            }
        };

        a.first();
    }
}

public class ImplementingAInterface {
    public static void main(String[] args) {
        Alphabets alphabets = new Alphabets();
        alphabets.test();
    }
}
