package inheritance.MultiLevel;

class Bird {
    void fly() {
        System.out.println("I can fly");
    }
}

class Parrot extends Bird {
    void whatColorAmI() {
        System.out.println("I am green");
    }
}

class SingingParrot extends Parrot {
    void singingBird() {
        System.out.println("I can sing an Opera !");
    }
}

public class Main2 {
    public static void main(String[] args) {
        SingingParrot singingParrot = new SingingParrot();
        singingParrot.fly();
        singingParrot.whatColorAmI();
        singingParrot.singingBird();
    }
}
