import java.util.Scanner;

public class ThrowEx1 {
    public static void main(String[] args) {
        System.out.println("Enter age : ");
        Scanner ob = new Scanner(System.in);
        int age = ob.nextInt();
        checkAge(age);
    }

    public static void checkAge(int age) {
        if (age < 18)
            throw new ArithmeticException("Alert ! Age can't be less than 18");
        else
            System.out.println("You are eligible to vote..");
    }
}
