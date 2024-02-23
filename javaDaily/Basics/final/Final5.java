
class BaseClass {
    public final void show() { // can't be overridden by subclass
        System.out.println("This is final method---> SHOW");
    }
    public final void see() { //can't be overridden by subclass
        System.out.println("Another final method---> SEE");
    }

    public void print() {
        System.out.println("Base class Printing..");
    }

    public void display() {
        System.out.println("Main display !");
    }
}

class DerivedClass extends BaseClass {
    public void print() {
        System.out.println("SubClass is printing.. !");
    }
}

public class Final5 {
    public static void main(String[] args) {

        DerivedClass derivedClass = new DerivedClass();
        derivedClass.see(); //final method, so not overridden
        derivedClass.show();    //Not overridden

        derivedClass.print(); //Since subclass overrides, it prints extended code from subclass

        derivedClass.display(); //Inherited from Base
    }
}

//Marking methods as final :

/* --> prevent those methods getting overridden in subclass
*  --> allows adding new methods , which can be extended or existing non-final
   --> ones to be overridden in subclass
   --> Gives less flexibility,as its just controlling a specific functionality getting modified
   --> and adding new ones which can be used normally */
