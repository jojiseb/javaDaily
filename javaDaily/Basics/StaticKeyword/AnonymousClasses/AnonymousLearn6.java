package AnonymousClasses;

interface TestInter {
    void display();
}

class SubInter {
    TestInter t = new TestInter() {
        @Override
        public void display() {
            System.out.println("Sub Inter display..");
        }
    };

    void anonMethod() {
        t.display();
    }
}

public class AnonymousLearn6 {
    public static void main(String[] args) {
        SubInter s = new SubInter();
        s.anonMethod();
    }
}
