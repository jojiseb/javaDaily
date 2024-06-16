public class InstanceInitializer6 {

    private int a = 10;

    {
        System.out.println("a : "+a);
        a = 90;
        System.out.println("After initialise in block : a - "+a);
    }

    InstanceInitializer6() {
        System.out.println("Before ...a : "+a);
        a = 900;
        System.out.println("After - a : "+a);
    }

    public static void main(String[] args) {
        InstanceInitializer6 i1 = new InstanceInitializer6();

        System.out.println("Calling ..");

        new InstanceInitializer6();
    }

    // first value is obtained from the value declared
    //Then, Instance initializer gets executed , re-initializing the value

    //After that the constructor is executed

    //An instance initializer is called before every constructor call
}
