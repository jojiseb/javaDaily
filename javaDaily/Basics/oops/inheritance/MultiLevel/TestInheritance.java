package inheritance.MultiLevel;

class Animal {
    void eat() {
        System.out.println("Eating..");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking..");
    }
}

class Puppy extends Dog {
    void woof() {
        System.out.println("Woofing...");
    }
}
public class TestInheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.bark();
        puppy.woof();
        puppy.eat();
    }
}
