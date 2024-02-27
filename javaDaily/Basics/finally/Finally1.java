public class Finally1 {
    public static void main(String[] args) {
        try {
            int num = 10/0;
        }
        catch(ArithmeticException e) {
            System.out.println("Error : "+e.getMessage());
        }
        finally {
            System.out.println("Works even if there is an error...So, Executes every time !");
        }
    }
}
