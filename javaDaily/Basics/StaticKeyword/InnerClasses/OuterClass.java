package InnerClasses;

public class OuterClass {
    private class InnerClass {
        void display() {
            System.out.println("Inner class display...");
        }
    }

    public void outerMethod() {
        InnerClass i = new InnerClass();
        i.display();
    }

    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        o.outerMethod();
    }
}
