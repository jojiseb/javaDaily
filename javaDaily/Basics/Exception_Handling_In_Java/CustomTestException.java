import java.util.Scanner;

public class CustomTestException {
    public static void main(String[] args) {
        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            if(age < 18) {
                throw new InvalidAgeForDriving("Min. age for driving is 18");
            }
            else {
                System.out.println("Eligible for Driving..");
            }
        }
        catch (InvalidAgeForDriving e) {
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }

    static class InvalidAgeForDriving extends Exception {
        public InvalidAgeForDriving(String errMessage) {
            super(errMessage);
        }

        @Override
        public String toString() {
            return getMessage();
        }
    }
}
