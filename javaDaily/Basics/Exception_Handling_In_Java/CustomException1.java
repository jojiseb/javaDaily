import java.util.Scanner;

public class CustomException1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = ob.nextInt();
        try {
            validate(number);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Exception occurs");
            System.out.println("Code after exception..");
        }
    }

    static void validate(int num) throws Custom{
        if(num < 10) {
            throw new Custom("Invalid value");
        }
        else {
            System.out.println("Valid Number");
        }
    }
}

class Custom extends Exception {    //Defining Custom exception
    Custom(String msg) {
        super(msg);
    }
}