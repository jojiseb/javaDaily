package inheritance.Multiple;

interface AnimalEat {
    void eat();
}

interface AnimalTravel {
    void travel();
}
            //Sub-Class seems to be inheriting 2 super classes
class Animal implements AnimalEat, AnimalTravel {
    public void travel() {
        System.out.println("Animal is on the go..");
    }

    public void eat() {
        System.out.println("Animal is eating..");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.travel();
    }
}
