
public class Main {
    public static void main(String[] args) {
        int c = 56;

        Integer v = 850;

        Integer b = new Integer(90);

        System.out.println(c);  // You can't apply dot operator here
                        //So, predictable functionality as integers;

        System.out.println(v);  // Can apply dot operator as this is an Object
    }                   //A class is just group of props and behaviours
}
