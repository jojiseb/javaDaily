
abstract class AnimalP {
    abstract void makeNoise();  //Unique to each, so sub-classes must provide
                        //implementations
    void eat() { //Common to all animals, so defined here
        System.out.println("Animal is eating");
    }
    void sleep() { //These can be overrided by sub-classes if necessary
        System.out.println("Animal is sleeping");
    }
}

class Lion extends AnimalP {
    void makeNoise() {
        System.out.println("Grrrrrr");
    }
}

class Human extends AnimalP {
    void makeNoise() {
        System.out.println("Blah blah");
    }
    @Override
    void eat() {
        System.out.println("Human is eating");
    }
    @Override
    void sleep() {
        System.out.println("Human is sleeping");
    }
}

class Pig extends AnimalP {
    void makeNoise() {
        System.out.println("Oink Oink");
    }
}

public class AnimalNew {
    public static void main(String[] args) {
        AnimalP animalP = new Human();
        animalP.makeNoise(); //Non-static methods are resolved during
        animalP.eat(); //run-time based on the type of object referred by the reference variable
        animalP.sleep(); //And, Not reference variable in itself

//   AnimalP animalP1 = new AnimalP(); Abstract classes can't
//   be instantiated

        System.out.println();
        AnimalP animalP1 = new Pig();
        animalP1.makeNoise();
        animalP1.eat();
        animalP1.sleep();
    }
}
