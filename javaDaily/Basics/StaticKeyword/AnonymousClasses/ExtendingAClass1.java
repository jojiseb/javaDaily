package AnonymousClasses;

abstract class One {
    abstract void oneMethod();
}

public class ExtendingAClass1 {
    public static void main(String[] args) {
        One one = new One() {
            @Override
            public void oneMethod() {
                System.out.println("One Method is implemented..");
            }
        };

        one.oneMethod();
    }
}
