package inheritance.SingleInheritance;

class SuperClass {
    void methodSuper() {
        System.out.println("Super method");
    }
}

class SubClass extends SuperClass {
    void methodSub() {
        System.out.println("Sub method");
    }
}

public class Main4 {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.methodSuper();
        subClass.methodSub();
    }
}
