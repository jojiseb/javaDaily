public class ThrowExample {

    public static int divide(int num1, int num2) throws Exception {
        if(num2 == 0) {
            throw new Exception("Divide by zero causes error !");
        }
        return num1/num2;
    }
    public static void main(String[] args) throws Exception {
        int a = 12;
        int b = 0;
        int result = divide(a, b);

        System.out.println("Answer : "+result);
    }
}
