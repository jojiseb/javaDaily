package inheritance.SingleInheritance;

class Bird {
    void fly() {
        System.out.println("I am bird..");
    }
}
class Parrot extends Bird {
    void whatColorAmI() {
        System.out.println("I am Green..");
    }
}

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.whatColorAmI();
    }
}
