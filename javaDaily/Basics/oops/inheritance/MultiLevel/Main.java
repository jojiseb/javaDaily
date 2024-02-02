package inheritance.MultiLevel;

class Grandparent {
    public void print() {
        System.out.println("Grandparent's print");
    }
}
class Parent extends Grandparent {
    public void print() {
        super.print();
        System.out.println("Parent's print");
    }
}

class Child extends Parent {
    public void print() {
//        super.super.print();  //violates encapsulation
        super.print();      //you can always access parent's members, through that the grand parent's
        System.out.println("Child's print");    //Not the other way
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.print();
    }
}
