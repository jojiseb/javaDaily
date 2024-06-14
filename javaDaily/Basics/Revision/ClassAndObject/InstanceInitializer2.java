public class InstanceInitializer2 {
    private int a;
    private int b;

    {
        a = 30;
        b = 90;

        System.out.println("a + b : "+(a+b));
    }

    InstanceInitializer2() {
        System.out.println("Default");
    }

    InstanceInitializer2(int c) {
        System.out.println("Parameterised..");
    }
    public static void main(String[] args) {
        new InstanceInitializer2();

        System.out.println();

        new InstanceInitializer2(1);
    }
}
