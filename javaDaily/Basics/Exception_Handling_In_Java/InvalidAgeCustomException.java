import java.util.Scanner;

public class InvalidAgeCustomException {
    public static void main(String[] args) {
        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            validAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validAge(int age) throws InvalidAgeException {
        if(age <= 0) {
            throw new InvalidAgeException("Age is Invalid !");
        }
        else if(age < 18) {
            throw new InvalidAgeException("Age must be 18 or greater to be eligible for voting");
        }
        else {
            System.out.println("Eligible for voting");
        }
    }

    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String errMessage) {
            super(errMessage);
        }
    }
}
