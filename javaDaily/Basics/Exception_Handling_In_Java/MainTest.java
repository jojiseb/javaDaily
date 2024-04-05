import java.util.Scanner;

public class MainTest {

    static void checkAge(int age) {
        if(age < 18) {
            throw new ArithmeticException("Alert ! You are under-age");
        }
        else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter age : ");
        Scanner ob = new Scanner(System.in);
        int age = ob.nextInt();
        checkAge(age);
    }
}
