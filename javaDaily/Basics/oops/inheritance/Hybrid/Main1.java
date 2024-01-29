package inheritance.Hybrid;

class A {
    int a = 1;
}

class B extends A {
    int b = 2;
}

interface C {
    int c = 3;
}

class D extends B implements C {
    int d = 4;
    int sum = a + b + c + d;
    public void display() {
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
        System.out.println("Value of c : "+c);
        System.out.println("Value of d : "+d);
        System.out.println("Sum : "+sum);
    }
}
public class Main1 {
    public static void main(String[] args) {
        D d = new D();
        d.display();
    }
}
