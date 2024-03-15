public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int div = 10/0;
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End of Code..");

        //Exception is handled wonderfully by the code using try-catch so that
        //normal flow of the code doesn't get affected.
    }
}
