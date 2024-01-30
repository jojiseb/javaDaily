package inheritance.InheriranceAndConstructors;

class Base {
    Base() {
        System.out.println("Base Class constructor is called");
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("Derived Class constructor is called");
    }
}

public class GFG {
    public static void main(String[] args) {
        Derived derived = new Derived();    //super class constructor is called, then derived class
    }                                       //constructor
}
