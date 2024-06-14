
abstract class Horn {
    abstract void makeSound();
}

class Part extends Horn {
    private String belongTo;

    Part(String b) {
        this.belongTo = b;
    }

    @Override
    void makeSound() {
        System.out.println("Pom pooomm....");
    }
}

public class NamedClass2 {
    public static void main(String[] args) {
        Part p = new Part("Car");
        p.makeSound();

        Part k = new Part("Bike");
        k.makeSound();
    }
}
