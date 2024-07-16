package AnonymousClasses;

class GreetingTest {
    String name;

    GreetingTest(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello , "+name);
    }
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        GreetingTest gt = new GreetingTest("Manu") {
            @Override
            public void greet() {
                System.out.println("Hello there, "+this.name);
            }
        };

        gt.greet();
    }
}
