public class MultiCatch2 {
    public static void main(String[] args) {
        try {
            int[] ar = {1,2,3,4};
            System.out.println(ar[11]);
            ar[4] = 23/0;
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurs");
        }
        catch (ArrayIndexOutOfBoundsException e) { // Here, ArrayIndexOutOfBoundsException is the first to be raised since ar[11]
            System.out.println("ArrayIndexOutOfBoundsException occurs"); //is tried to be accessed first, before 23/0 which causes
        }                                                   // ArithmeticException
        catch (Exception e) {
            System.out.println("Main Exception occurs");
        }
    }
}
