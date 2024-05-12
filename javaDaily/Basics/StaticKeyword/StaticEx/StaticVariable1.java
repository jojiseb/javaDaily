package StaticEx;

public class StaticVariable1 {
    static int a = 7;
    static int b = 2;

    static {
        System.out.println("I am in static Block");
        System.out.println("a : "+StaticVariable1.a+", b : "+StaticVariable1.b); //a = 7, b = 2
        b = a * 10;
    }

    public static void main(String[] args) {
        System.out.println("a : "+StaticVariable1.a+", b : "+StaticVariable1.b); //a = 7, b = 70

        StaticVariable1.b += 30;

        System.out.println("After ");

        System.out.println("a : "+StaticVariable1.a+", b : "+StaticVariable1.b); //a = 7, b = 100
    }
}
