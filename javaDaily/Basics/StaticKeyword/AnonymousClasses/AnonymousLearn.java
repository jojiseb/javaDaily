package AnonymousClasses;

class MyClassAnon { //Super class
    void displayMessage() {
        System.out.println("Super Message in Super Class");
    }
}

public class AnonymousLearn {
    public static void main(String[] args) {
        MyClassAnon my = new MyClassAnon() { //Basically extending a super class/interface

            //We are creating an instance of super class using anonymous inner class. Its
            //defined and instantiated inline without declaring a separate class
            @Override    //Defined and instantiated in a single step
            public void displayMessage() {
                System.out.println("Message in Anonymous Learn");
            }
        };

        my.displayMessage(); //Anonymous class's implementation gets displayed, since it overrides
        //super class implementation

        //During compilation, A separate class file for Anonymous Inner Class is created Eg: MyClassAnon$.class

        //In this case, The generated class is a subtype of super class that the anonymous class extends
    }
}
