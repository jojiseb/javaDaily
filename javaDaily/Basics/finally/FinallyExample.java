public class FinallyExample {
    public static void main(String[] args) {
        try {
            int res = 100/2;
            System.out.println("Res : "+res);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I get executed everytime !!");
        }
    }
}
