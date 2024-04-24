import java.util.Scanner;
import static UserDefined.Compare.smallestOfNumbers;
public class NumberComparison1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("First : ");
        double a = ob.nextInt();
        System.out.println("Second : ");
        double b = ob.nextInt();

        if(a != b) {
            smallestOfNumbers(a, b); //Able to access static member of Compare class without using fully qualified name
//            UserDefined.Compare.smallestOfNumbers(a,b); --> You don't need to import UserDefined package when using fully qualified name. //like UserDefined.Compare.smallestNumbers etc.
        }
        else {
            System.out.println("Both are equal !");
        }
    }
}
