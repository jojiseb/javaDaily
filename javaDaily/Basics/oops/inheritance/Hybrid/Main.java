package inheritance.Hybrid;

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}

interface WildAnimal {
    void roam();
}

class Lion extends Animal implements WildAnimal {
    @Override
    void eat() {
        System.out.println("Lion is eating");
    }
    @Override
    public void roam() {
        System.out.println("Lion is roaming");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();

        Lion lion = new Lion();
        lion.eat();
        lion.roam();
    }
}
