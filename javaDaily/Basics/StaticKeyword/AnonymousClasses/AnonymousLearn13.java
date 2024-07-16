package AnonymousClasses;

abstract class Abstract {
    public abstract void one();
    public void additionalMethod() {
        System.out.println("Main class Method..");
    }
}

public class AnonymousLearn13 {
    public static void main(String[] args) {
        Abstract ab = new Abstract() {
            @Override
            public void one() {
                System.out.println("Sub-Class One");
            }
            @Override
            public void additionalMethod() {
                System.out.println("Sub-Class additional");
            }
        };

        ab.one();
        ab.additionalMethod();
    }
}
