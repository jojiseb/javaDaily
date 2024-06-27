package StaticNestedClass;

public class OuterClass {

    private String outer = "Outer Field";
    private static String staticField = "Static Item";

    static class Nested { //Static Nested Class, defined class level outside any method
        void innerPrint() {
//            System.out.println("Outer : "+outer); Static nested class can only access static members i.e., static variables, methods

            System.out.println("Static Item : "+staticField);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested(); //Doesn't need outer class instance, as the inner class instance is Static and not enclosed to
        nested.innerPrint();    //Outer class instance
    }
}
