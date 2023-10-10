public class CasesToAvoidAutoBoxing {
    public static void main(String[] args) {

        Integer a = 600;    // Comparing objects created through auto-boxing creates
                            //unexpected results, due to different object references
        Integer s = 600;

        boolean val = (a == s) ? true : false;

        System.out.println("Val : "+val);   // false

        int y = 100;
        int u = 100;

        boolean i = (y == u) ? true : false;

        System.out.println("Value : "+i);   // true

    }
}
