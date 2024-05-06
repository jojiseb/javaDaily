package StaticEx;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator.add(12, 40);
        Calculator.multiply(12, 40);
    }
}
