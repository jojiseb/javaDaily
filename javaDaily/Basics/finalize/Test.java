public class Test { //Part to understand how
    public static void main(String[] args) {
        try {
            System.out.println("Finalize test");
        }
        catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
