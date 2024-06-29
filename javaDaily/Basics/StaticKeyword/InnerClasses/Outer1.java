package InnerClasses;

public class Outer1 {

    private static String name = "Inner Classes";
    private int number = 2;

    void test() {
        System.out.println("Access");
    }

    class Inner1 { //Inner Class
        void display() {    //ABle to access static and non-static members since Inner Class instance
            System.out.println("Name : "+name+", NUmber : "+number); //holds a reference to outer class instance
            test(); //This reference allows member inner class to have access to variables and methods of outer class
        }
    }

    public static void main(String[] args) {
        Outer1 outer1 = new Outer1(); //Outer class instance is needed to create inner class instance
        Inner1 inner1 = outer1.new Inner1(); //Inner class instance is inherently related to outer class
        //instance, ensuring that inner class instance operates within specific context of outer class
        //instance

        //outer1.new Inner1(); --> shows that inner class instance is tied to outer class instance
        inner1.display();
    }
}

//Each instance of inner class is inherently associated with an instance of outer class
//This association allows the inner class to access outer class's members directly

//This hidden reference/association is used by inner class to access outer class's members
//without needing to pass the outer class instance explicitly

//It uses the implicit reference to outer instance which is used to create inner class instance,
//when accessing outer class members !
