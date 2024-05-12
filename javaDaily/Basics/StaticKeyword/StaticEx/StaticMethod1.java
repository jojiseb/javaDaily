package StaticEx;

public class StaticMethod1 {
    public static void main(String[] args) {
        StaticCheck staticCheck = new StaticCheck("One");
        System.out.println("P1 :  id : "+StaticCheck.id+", Name : "+staticCheck.name+", Race : "+StaticCheck.race);

        StaticCheck staticCheck1 = new StaticCheck("Two");
        System.out.println("P2 : id : "+StaticCheck.id+", Name : "+staticCheck1.name+", Race : "+StaticCheck.race);

//        nonStaticGreeting(); --> Error, Non-Static item can't be referenced in a static context

        // Need to use instance for that, to access a non-static data or instance data in static context

        greeting(); //Static method accessed in static context

        StaticMethod1 sm = new StaticMethod1(); // You can't access non-static stuffs in static context, without referencing their instances
                                        // So, We are referencing it
        sm.nonStaticGreeting(); //Access using instance variable


        StaticMethod1 staticMethod1 = new StaticMethod1();
        staticMethod1.funCheck();
    }

    //We are accessing a non-static method or instance method is a static method main() (Belongs to Class),
    // which needs referencing to Instance

    void nonStaticGreeting() { //Something which is non-static belongs to an Object, needs Object to access
        System.out.println("Instance greeting, which can be using Instance");
    }
    static void greeting() {
        System.out.println("Non static Greeting");
    }

    void funCheck() {
        nonStaticGreeting(); //This instance method is not accessed by referencing an instance like in static context, Since, funCheck() will be connected to main()
        // someway - i.e., An Object will be created 100% since everything will be routed back to static method
        //  greeting(); //static is globally accessible, so this method will be accessible inside instance method too
    }
}
