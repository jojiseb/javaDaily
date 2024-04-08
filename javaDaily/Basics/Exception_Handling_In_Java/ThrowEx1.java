import java.util.Scanner;

public class ThrowEx1 {
    public static void main(String[] args) {
        System.out.println("Enter age : ");
        Scanner ob = new Scanner(System.in);
        int age = ob.nextInt();
        checkAge(age);
    }

    public static void checkAge(int age) {  //throw keyword exceptions are usually not handled using try-catch blocks, it's something
        if (age < 18)                   //that is kept to be taken care of by programmer -- It's best to correct them, instead of handling them
            throw new ArithmeticException("Alert ! Age can't be less than 18");
        else
            System.out.println("You are eligible to vote..");
    }
}
