package StaticEx;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int divide(int a, int b) {
        return a/b;
    }

    public static void main(String[] args) {
        int resultOfAddition = Calculator.add(20,45);
        System.out.println("Sum : "+resultOfAddition);
        int resultOfSubtraction = Calculator.subtract(67, 30);
        System.out.println("Difference : "+resultOfSubtraction);
        int resultOfMultiplication = Calculator.multiply(3, 8);
        System.out.println("Product : "+resultOfMultiplication);
        int resultOfDivision = Calculator.divide(12, 4);
        System.out.println("Quotient : "+resultOfDivision);
    }
}
