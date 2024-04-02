import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        try {
            int[] numbers = {11,27,30,42};
            System.out.println(Arrays.toString(numbers));
            System.out.println("Enter index : ");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();

            if(index < 0 || index >= numbers.length) {
                throw new ArrayIndexOutOfBoundsException("Index can't be less than 0 or greater than array length !"); //ArrayIndexOutOfBounds Exception is caught here
            }       // So, Normal flow not interrupted
            else {
                System.out.println("Number : "+numbers[index]); //The message passed as parameter to above exception class is displayed as message in catch block..e.getMessage()
            }
        }
        catch (Exception e) {
            System.out.println("Catching..."+e.getMessage());
        }
    }
}
