import java.util.Scanner;

public class ThrowEx2 {
    public static void main(String[] args) {    //It's always best to correct them instead of handling un-checked exceptions
        try {
            System.out.println("Enter Age : ");
            Scanner ob = new Scanner(System.in);

            int age = ob.nextInt();
            checkAge(age);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age) {   //If exceptions are raised using throw keyword and if they are handled using try catch,
        if(age <= 0) {          //then control will flow to catch block, since exception is raised and must be handled.
            throw new ArithmeticException("Invalid Age");
        }
        if(age < 18) {
            throw new ArithmeticException("You are too young to vote");
        }
        System.out.println("Eligible to vote !!");
    }

}
