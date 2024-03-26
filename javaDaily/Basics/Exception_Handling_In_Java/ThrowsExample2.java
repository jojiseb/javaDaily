import java.util.Scanner;

public class ThrowsExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num1 : ");
        float a = scanner.nextInt();
        System.out.println("Enter num2 : ");
        float b = scanner.nextInt();

        float res = divide(a,b);

        System.out.println("Result : "+res);
    }

    static float divide(float num1, float num2) {
        return num1/num2;
    }
}
