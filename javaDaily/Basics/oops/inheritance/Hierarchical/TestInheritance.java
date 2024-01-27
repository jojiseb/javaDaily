package inheritance.Hierarchical;

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

class Cat extends Animal {
    void meow() {
        System.out.println("Meowww..");
    }
}
public class TestInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        Cat cat = new Cat();
        cat.meow();
        cat.eat();
    }
}
