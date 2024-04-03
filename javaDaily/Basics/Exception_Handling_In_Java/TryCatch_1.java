import java.util.Scanner;

public class TryCatch_1 {
    public static void main(String[] args) {
        try {
            int[] ar = {10,20,30,40};
            System.out.println("Enter the index : ");
            Scanner ob = new Scanner(System.in);

            int index = ob.nextInt();
            if(index < 0 || index >= ar.length) {
                throw new ArrayIndexOutOfBoundsException(index);
            }
            else {
                System.out.println("Element using Index "+index+" is : "+ar[index]);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
