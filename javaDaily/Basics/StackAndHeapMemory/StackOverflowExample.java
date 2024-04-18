public class StackOverflowExample {
    public static void main(String[] args) {
        try {
            recursiveCode(1);
        }
        catch (Exception e) {
            System.out.println("Stack overflow error caught: "+e.getMessage());
        }
    }

    public static void recursiveCode(int counter) {
        System.out.println("Counter : "+counter);

        recursiveCode(1);
    }
}
