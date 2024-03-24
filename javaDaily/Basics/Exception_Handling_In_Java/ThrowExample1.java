public class ThrowExample1 {
    public static void main(String[] args) {
        int divide = 10/0;
    }

    public static int divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Divide by 0 incoming....");
        }
        return a/b;
    }
}
