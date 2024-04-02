import java.util.Scanner;

public class TryCatch_1 {
    public static void main(String[] args) {
        try {
            int[] ar = {10,20,30,40};
//            System.out.println(ar[12]);
            Scanner ob = new Scanner(System.in);

            int index = ob.nextInt();
            if(index < 0 || index >= ar.length) {
                throw new ArrayIndexOutOfBoundsException(index);
            }
            else {
                System.out.println("Index is : "+ar[2]);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
