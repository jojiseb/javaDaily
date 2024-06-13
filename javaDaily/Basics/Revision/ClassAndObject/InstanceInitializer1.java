public class InstanceInitializer1 {

    private int a;
    private int b;

    {
        a = 30; //Using complex initialization logic inside
        b = calculate(); //InstanceInitializer block

        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

    InstanceInitializer1() {
        System.out.println("Hello");
    }

    public int calculate() {
        return a * 20;
    }

    public static void main(String[] args) {
        new InstanceInitializer1(); //Instance initializer block is first to execute
    }                           //Second to execute is a constructor.
}                           //Instance initializer block is executed before every constructor call
