public class InstanceInitializer {

    private int a = 9;
    private String b;

    private static int count;

    InstanceInitializer() {     //May execute first before a constructor. But is not called if a constructor is created
        System.out.println("\nConstructor..");
        System.out.println("a : "+a);
        a = 13;
        System.out.println("After re-assignment..");
        System.out.println("a : "+a+"\n");
    }

    {
        System.out.println("\nInside Initializer..");  //Instance initializer executes before every constructor
        System.out.println("a : "+a);                   //Call
        System.out.println("Count : "+count);
        a = 10;                         //Mostly used for applying complex initialization logic
        System.out.println("a : "+a);   //Or to add some logic common to all constructors
        count++;
        System.out.println("Exiting\n");
    }
    public static void main(String[] args) {
        InstanceInitializer i = new InstanceInitializer();
        System.out.println("a : "+i.a+", Count : "+InstanceInitializer.count);
        InstanceInitializer q = new InstanceInitializer();
        System.out.print("\nCount : "+InstanceInitializer.count);
        System.out.println(", a : "+q.a);
    }
}
