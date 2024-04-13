import java.util.Scanner;

public class ThrowsDemo1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter first : ");
        int a = ob.nextInt();
        System.out.println("Enter second : ");
        int b = ob.nextInt();

        try {
            division(a,b);
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Finished division !");
    }
                    //Risk of Arithmetic exception exists, We are warning those using the method using throws in method signature...
    static void division(int a, int b) throws ArithmeticException {    //Now its responsibility of method that uses division() to handle exception
        System.out.println(a/b);
    }
}
