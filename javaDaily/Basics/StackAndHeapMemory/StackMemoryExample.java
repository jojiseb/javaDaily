import java.util.Scanner;

public class StackMemoryExample {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = ob.nextInt();
        System.out.println("Enter second number : ");
        int b = ob.nextInt();

        int sum = addNumbers(a,b);

        System.out.println("Sum : "+sum);
    }
    public static int addNumbers(int x, int y) {
        return x+y;
    }
}
