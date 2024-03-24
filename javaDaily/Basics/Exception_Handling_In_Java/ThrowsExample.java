public class ThrowsExample {

    public static int divide(int num1, int num2) throws ArithmeticException{ // throws acts as a warning , that divide() might cause ArithmeticException and use
        return num1/num2;     //with caution. Now, The person who uses it needs to handle it and not responsibility of divide() if divide by zero error occur
    }

        //The throws keyword is kinda a warning about exception so the method which uses it must prepare itself with try-catch
    public static void main(String[] args) {
        int a = 12;
        int b = 0;
//        int result = divide(a, b);
//
//        System.out.println("Answer : "+result);

        try {
            int result = a/b;
            System.out.println("result : "+result);
        }
        catch (Exception e) {           //Now, After handling the error warning (issued by throws), using try-catch, the program flow is executed without halting
            System.out.println("Exception");
            System.out.println(e.getMessage());
        }
    }
}
