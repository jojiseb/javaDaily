
package AnonymousClasses;

abstract class AnonymousInnerTest {
    abstract void myTest();
}

public class Outer_Class {
    public static void main(String[] args) { //Anonymous class local to a method
        AnonymousInnerTest a = new AnonymousInnerTest() { //--> Anonymous class declared without a class name

                //--> Declared and instantiated at the same time

                //--> Anonymous Inner classes are mostly used to override methods of class or an interface.
            public void myTest() {
                System.out.println("MyTest...");
            }
        };

        a.myTest();
    }
}
