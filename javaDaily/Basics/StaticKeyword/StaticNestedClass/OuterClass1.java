package StaticNestedClass;

public class OuterClass1 {
    private static String name = "Static nested Class";
    private int number = 50;

    private static void hello() {
        System.out.println("Hello !!");
    }

    static class StaticNested {
        void display() {
            System.out.println("Name : "+name);
//            System.out.println("Number : "+number); can't access non-static members
            //Static nested classes can only access static members of outer class
            hello();
        }
    }

    public static void main(String[] args) {
        //You don't need to create an outer class instance to create an inner class instance
        //Since, Inner class isn't inherently associated to instance of outer class

        StaticNested staticNested = new StaticNested();
        staticNested.display();
    }
}
