
interface OperationsTest {
    int add(int a, int b);      //interface methods are public by default, So, implementations must be public, to value the contract of interface
    int subtract(int a, int b);
    int multiply(int a, int b);
    int divide(int a, int b);

    default void methodInInterface() {
        System.out.println("Default In OperationsTest");
    }
}

class SolveTest implements OperationsTest {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a/b;
    }

    @Override
    public void methodInInterface() {
        System.out.println("SolveTest Implementation");
    }
}

class AdvancedSolve implements OperationsTest {
    @Override
    public int add(int a, int b) {
        return a + b + 10;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b - 10;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b * 10;
    }

    @Override
    public int divide(int a, int b) {
        return a / b / 10;
    }

}

public class Operations1 {
    public static void main(String[] args) {
        OperationsTest operationsTest = new SolveTest();

        System.out.println("Sum : "+operationsTest.add(12, 30));
        System.out.println("Diff : "+operationsTest.subtract(50, 20));
        System.out.println("Multiply : "+operationsTest.multiply(2, 7));
        System.out.println("Divide : "+operationsTest.divide(90, 30));

        operationsTest.methodInInterface(); //SolveTest's implementation will be displayed

        System.out.println();
        OperationsTest operationsTest1 = new AdvancedSolve();

        System.out.println("Sum : "+operationsTest1.add(45, 67));
        System.out.println("Diff : "+operationsTest1.subtract(56, 30));
        System.out.println("Multiply : "+operationsTest1.multiply(20, 70));
        System.out.println("Divide : "+operationsTest1.divide(700, 11));

        operationsTest1.methodInInterface(); //Default implementation will be displayed, since
                                            //default method is not overridden by the implemented class
    }
}
