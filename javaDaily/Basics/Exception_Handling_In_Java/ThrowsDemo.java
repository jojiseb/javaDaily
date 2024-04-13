import java.util.Scanner;

public class ThrowsDemo {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("First number : ");
        int a = ob.nextInt();
        System.out.println("Second number : ");
        int b = ob.nextInt();

        division(a, b);

        System.out.println("Finished");
    }

    static void division(int a, int b) {    //Handled in the root source itself using try-catch
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
