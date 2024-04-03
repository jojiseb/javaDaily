public class MultiCatch1 {
    public static void main(String[] args) {
        try {
            int[] ar = {10,9,8,7};
            ar[9] = 11/0;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOfBounds Exception occurs");
        }
        catch (ArithmeticException e) { //Here, ArithmeticException is the first to occur and to be caught, since division by zero is first performed before assigning
            System.out.println("Arithmetic Exception occurs");  // to array index which doesn't exist
        }
        catch (Exception e) {
            System.out.println("Main Exception occurs"); //Main Exception must be in lower order of catch , when using multiple catch blocks
        }                                       //Else it makes every other exceptions redundant i.e., Those other catch blocks won't be of use, since
    }                                           //Main exception catch block will be raised for every exception
}
