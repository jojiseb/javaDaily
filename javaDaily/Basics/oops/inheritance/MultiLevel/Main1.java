package inheritance.MultiLevel;

class One {
    public void printOne() {
        System.out.println("Geeks");
    }
}
class Two extends One {
    public void printTwo() {
        System.out.println("For");
    }
}

class Three extends Two {
    public void printThree() {
        System.out.println("Geeks...");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Three three = new Three();
        three.printOne();
        three.printTwo();
        three.printThree();
    }
}
