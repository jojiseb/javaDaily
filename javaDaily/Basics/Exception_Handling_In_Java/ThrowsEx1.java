import java.util.Scanner;

public class ThrowsEx1 {
    public static void main(String[] args) {
        System.out.println("Enter age : ");
        Scanner ob = new Scanner(System.in);
        int age = ob.nextInt();
        checkAge(age);
    }

    public static void checkAge(int age) throws ArithmeticException {   //We use throws in method Signature itself which acts a warning
        if(age < 18)        //for those who use the method, that you need to be aware of a possible error and handle it , if you use method
            throw new ArithmeticException("Age can't be less than 18");
        else                    //throws - warns about exception to those who use the method
            System.out.println("Eligible for voting");// Now, It's the responsibility of one who uses it
    }
}
