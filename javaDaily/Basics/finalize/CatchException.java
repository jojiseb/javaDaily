public class CatchException {
    public static void main(String[] args) {
        CatchException catchException = new CatchException();

        catchException = null;

        System.gc();

        System.out.println("Clean up is done implicitly...");
    }

    protected void finalize() {
        System.out.println("Started finalize..");
        try {
            int k = 1/0;        //Here, finalize() is completed execution, by handling the exception
        }                               //Now, Error isn't ignored by gc
        catch (ArithmeticException e) {
            System.out.println("Error handled..");
            System.out.println(e.getMessage());
        }

        System.out.println("Finalization completed...");
    }
}
