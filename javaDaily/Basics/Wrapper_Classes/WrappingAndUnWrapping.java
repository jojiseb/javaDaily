public class WrappingAndUnWrapping {
    public static void main(String[] args) {
        int a = 34;

        System.out.println(a);
        Integer q = 23;

        System.out.println(q);

        Integer w = new Integer(a);
        System.out.println(w);

        Integer e = new Integer(q);
        System.out.println(e);
    }
}
