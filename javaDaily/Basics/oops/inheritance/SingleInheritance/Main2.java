package inheritance.SingleInheritance;

class One {
    public void print_One() {
        System.out.println("One");
    }
}

class Two extends One {
    public void printTwo() {
        System.out.println("Two");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Two two = new Two();
        two.print_One();
        two.printTwo();
        two.print_One();
    }
}
