package inheritance.Hierarchical;

class Bird {
    void fly() {
        System.out.println("Flying bird");
    }
}

class Parrot extends Bird {
    void whatColor() {
        System.out.println("I am green\n");
    }
}

class Crow extends Bird {
    void whatColor() {
        System.out.println("I am black\n");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.whatColor();

        Crow crow = new Crow();
        crow.fly();
        crow.whatColor();
    }
}
