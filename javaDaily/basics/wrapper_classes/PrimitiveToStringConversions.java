public class PrimitiveToStringConversions {
    public static void main(String[] args) {
        // All primitive types are converted to string by using wrapper classes, by overriding toString()

        int a = 67;
        System.out.println(a);
        String a1 = Integer.toString(a);
        System.out.println(a1);

        float b = 67.8f;
        System.out.println(b);
        String a2 = Float.toString(b);
        System.out.println(a2);

        char c = '5';
        System.out.println(c);
        String ch = Character.toString(c);
        System.out.println(ch);

        double d = 56.77;
        System.out.println(d);

        String df = Double.toString(d);
        System.out.println(df);


    }
}
