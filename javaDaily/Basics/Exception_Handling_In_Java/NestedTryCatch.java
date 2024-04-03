public class NestedTryCatch {
    public static void main(String[] args) {
        try { //Main try-catch
            try {       //try-catch 2
                try {           //try-catch 3
                    int[] nums = {12,13,14};
                    System.out.println(nums[9]);
                }
                catch (ArithmeticException e) {
                    System.out.println("Arithmetic Exception occurs");
                }
            }
            catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception occurs");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurs");
        }
        catch (ArrayIndexOutOfBoundsException e) {      // ArrayIndexOutOfBoundsException is caught in Main try-catch since its caught there only
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }
        catch (Exception e) {
            System.out.println("Main Exception occurs");
        }
    }
}
