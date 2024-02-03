package inheritance.Hierarchical;

class A {
    void printA() {
        System.out.println("printing A");
    }
}
class B extends A {
    void printB() {
        System.out.println("printing B");
    }
}
class C extends A {
    void printC() {
        System.out.println("printing C");
    }
}

class D extends A {
    void printD() {
        System.out.println("printing D");
    }
}

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.printA();
        b.printB();

        C c = new C();
        c.printA();
        c.printC();

        D d = new D();
        d.printA();
        d.printD();
    }
}
