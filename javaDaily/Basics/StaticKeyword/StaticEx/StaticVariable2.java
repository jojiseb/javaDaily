package StaticEx;

public class StaticVariable2 {

    private static int outside; //valid declaration of static variable
    public static void main(String[] args) {
        //static int inside; // causes error since static declaration is not allowed inside any method

        //Why ? Static variables are associated with class itself, rather than with any class instance.
        //Once initialized, a static variable remains in memory for the duration of program, and its scope is entire class !
        //So it's intended to be shared among all instances of class or accessed independently of any instance.

        //Variables declared inside a method are local to that method. Means they are created when the method is called
        //and destroyed when the method exits. This scope is limited to method execution and not beyond that.

        //Static variables are designed to maintain a state that is shared across all instances of a class or to hold constant values
        //(static final variables).
    }
}
