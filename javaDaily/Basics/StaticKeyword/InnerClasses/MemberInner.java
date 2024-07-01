package InnerClasses;

public class MemberInner {

    private String outerField = "Outer Field";

    static boolean test = true;

    class Inner { //Member inner class - outside any method, defined class level
        void innerDisplay() { //Can access outer class's members including private ones
            System.out.println("Outer Field : "+outerField+", Test : "+test);
        }

//        static void testStatic() {
//
//        }

        //Can't define static members for Non-static Inner classes, as a non-static inner class is itself holds a reference to
        //outer class instance. Declaring a member static means, it is dependent on class only.

        //Having static members in nested classes, means defining class-level data that needs to be shared
        //across all instances of inner class, independent of specific outer class instance

        //This conflicts with the inner class dependency of outer class instance

    }  //Can access outer Field directly, cuz inner class instances hold a reference to
    //outer class instances

    public static void main(String[] args) {
        MemberInner memberInner = new MemberInner(); //Needs an Outer class to instantiate
        Inner inner = memberInner.new Inner();

        //Why do we need an outer class to instantiate a member inner class ??

        //It's due to the way member inner classes are tied to their enclosing instances.
        //A member inner-class is non-static, means each instance of the inner class is associated with
        //an instance of outer class.

        //This association allows the inner class to directly access outer class's instance variables and methods,
        //including the private ones.

        //memberInner.new Inner(); --> Shows the association of inner class instance to outer class instance

        inner.innerDisplay();
    }
}
