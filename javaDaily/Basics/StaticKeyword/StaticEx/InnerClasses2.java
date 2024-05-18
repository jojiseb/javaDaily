package StaticEx;

import java.util.Arrays;

import static java.lang.System.out;


public class InnerClasses2 {

    private static final java.io.PrintStream outTest = System.out;

    static class InnerTest { //Now, Inner Class is not dependent on Objects of Outer Class, but on Class itself
        String name;
        InnerTest(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        InnerTest it = new InnerTest("Abhi");   //Static inner class can create its object in main()
        InnerTest it1 = new InnerTest("Sunny"); //A static inner class is a static member of outer class. It simply means Inner class can instantiate
        //its object without an instance of outer class.

        System.out.println("1st Name : "+it.name); //Abhi
        System.out.println("2nd Name : "+it1.name); //Sunny

        //We ae able to access System class , since its public-->println() is a method, out is a variable and System is a class

        //Since out is a static final variable. Static means an object of PrintStream class is not need to be created to use it.

        //out is just reference variable of printStream. So, we access using refVariable.instanceMethod()

        out.println("Testing Output.."); //imported System.out, where System is a public class, wih static object out

        outTest.println("Alias Test"); //Using Alias outTest to use in place of System.out

        System.out.println(it); //Since, This class doesn't have a toString(), Object class's implementation is used by default
    }
}
