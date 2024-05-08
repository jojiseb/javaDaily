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

        StaticMethod1 sm = new StaticMethod1();
        sm.nonStaticGreeting(); //Access using instance variable
    }
    void nonStaticGreeting() {
        System.out.println("Instance greeting, which can be using Instance");
    }
    static void greeting() {
        System.out.println("Non static Greeting");
    }
}
