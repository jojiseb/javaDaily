package inheritance.Hybrid;

class A1 {
    int a = 10;
}

class B1 extends A1 {
    int b = 20;
}

class C1 extends B1 {
    int c = 30;
    int total = a + b + c;
    void total() {
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("Total : "+total+"\n");
    }
}

class D1 extends B1 {
    int d = 40;
    int sum = a + b + d;

    void sum() {
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("d : "+d);
        System.out.println("Total : "+sum+"\n");
    }
}


public class Main2 {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.total();

        D1 d1 = new D1();
        d1.sum();
    }
}
