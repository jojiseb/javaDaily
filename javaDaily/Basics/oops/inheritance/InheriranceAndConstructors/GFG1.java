package inheritance.InheriranceAndConstructors;

class Base1 {
    int x;
    Base1(int _x) {
        this.x = _x;
        System.out.println("Hello "+x);
    }
}

class Derived1 extends Base1 {
    int y;
    Derived1(int x, int _y) {
        super(x);
        this.y = _y;
        System.out.println("hello "+x+" & "+y);
    }

    void display() {
        System.out.println("x : "+x+", y : "+y);
    }
}

public class GFG1 {
    public static void main(String[] args) {
        Derived1 derived1 = new Derived1(2000, 1000);
        derived1.display();
    }
}
