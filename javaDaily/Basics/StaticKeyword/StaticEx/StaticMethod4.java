package StaticEx;

class Computer {
    static void work() {
        System.out.println("Computer is running...");
    }

    void instance() {
        System.out.println("Parent instance");
    }
}

class Laptop extends Computer {
    static void work() {
        System.out.println("Laptop is working...");
    }

    void instance() {
        System.out.println("Sub instance");
    }
}

public class StaticMethod4 {
    public static void main(String[] args) {
//        Computer computer = new Computer();
//        computer.instance();    //instance method of base is called

        Computer computer1 = new Laptop();
        computer1.instance();
    }
}
