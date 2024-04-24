import java.util.Scanner;
import UserDefined.MathOperations;

public class ImportTest {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the item 1 : ");

        int number1 = ob.nextInt();

        System.out.println("Enter Item 2 : ");

        int number2 = ob.nextInt();

        System.out.println("Sum : "+MathOperations.add(number1, number2));
        System.out.println("Difference : "+MathOperations.subtract(number1, number2));
    }
}
