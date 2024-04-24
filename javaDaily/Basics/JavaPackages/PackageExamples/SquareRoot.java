
 //Built-in packages -
// utility classes exist in util pkg
                            //classes that support language exist in java.lang pkg

import static java.lang.Math.sqrt;

import static java.lang.System.in; //Static import for input
import static java.lang.System.out; //static import for output
public class SquareRoot { //static import always works for methods or fields declared as static in the packages, Rest all requires importing and Object initialisation
    public static void main(String[] args) {
//        Scanner obj = new Scanner(in);
        java.util.Scanner obj = new java.util.Scanner(in); //Using fully qualified name
        out.println("Enter the number : ");
        int num = obj.nextInt();

        out.println("Square root is : ");
        out.println(sqrt(num)); //Uses static import

//        Math.sqrt(num); Also works since sqrt method is static , so can be accessed directly using ClassName instead of using object
    }
}
