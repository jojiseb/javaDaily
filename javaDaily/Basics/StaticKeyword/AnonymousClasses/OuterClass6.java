package AnonymousClasses;

public class OuterClass6 {

    private static String item = "table";
    private static int number = 20;

    String type = "String";
    int i = 1;

    public void out() {
        System.out.println("Item : "+item);
        System.out.println("Number : "+number);
        System.out.println("Type : "+type);
        System.out.println("i : "+i);
    }

    public void testInner() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run test");
            }
        };
        r.run();
    }

    public static void main(String[] args) {
        OuterClass6 o = new OuterClass6();
        o.testInner();
        o.out();
    }
}
