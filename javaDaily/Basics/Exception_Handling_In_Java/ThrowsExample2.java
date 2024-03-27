import java.util.Scanner;

public class ThrowsExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num1 : ");
        int a = scanner.nextInt();
        System.out.println("Enter num2 : ");
        int b = scanner.nextInt();

        int res = divide(a,b);

        System.out.println("Result : "+res);
    }

    static int divide(int num1, int num2) {
        return num1/num2;
    }
}
