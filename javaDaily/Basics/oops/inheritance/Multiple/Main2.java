package inheritance.Multiple;

interface A1 {
    void extract1();
}
interface A2 {
    void extract2();
}

class A3 implements A1, A2 {

    public void extract1() {
        System.out.println("Try again");
    }
    public void extract2() {
        System.out.println("Check...");
    }
}

public class Main2 {
    public static void main(String[] args) {
        A3 a3 = new A3();
        a3.extract1();
        a3.extract2();
    }
}
