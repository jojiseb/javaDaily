package objectAndClass;

interface ShapeTest {
    void drawable();
    double areaMeasurable();
}

class RectangleTest implements ShapeTest {
    int length;
    int breadth;

    RectangleTest(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void drawable() {
        System.out.println("Rectangle is drawable");
    }
    @Override
    public double areaMeasurable() {
        return length * breadth;
    }
}

class SquareTest implements ShapeTest {

    int r;
    @Override
    public double areaMeasurable() {
        System.out.println("Square is measurable");
        return  r * r;
    }

    @Override
    public void drawable() {
        System.out.println("Can be drawn !");
    }
}


public class ShapeInterface {
    public static void main(String[] args) {
        ShapeTest q = new RectangleTest(12, 5);
        q.drawable();

        System.out.println("Area of rectangle : "+q.areaMeasurable());

        ShapeTest s = new SquareTest();
        s.drawable();

        System.out.println("Area of Square : "+s.areaMeasurable());
    }
}
