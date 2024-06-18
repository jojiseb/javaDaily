import java.util.ArrayList;
import java.util.List;

abstract class ShapeTest { //Abstract classes can be 0 to 100% Abstract
    abstract void draw();
    void display() {        //Can include implementations
        System.out.println("Hello Hi !");
    }
}
class CircleTest extends ShapeTest {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class SquareTest extends ShapeTest {
    void draw() {
        System.out.println("Drawing Square");
    }
}

class RectangleTest extends ShapeTest {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class PolygonTest extends ShapeTest {

    void draw() {
        System.out.println("Drawing Polygon");
    }

    void display() {
        System.out.println("Poly here !");
    }
}
public class ShapeNew {
    public static void main(String[] args) {
        List<ShapeTest> shapes = new ArrayList<>();

        shapes.add(new SquareTest());
        shapes.add(new CircleTest());
        shapes.add(new RectangleTest());
        shapes.add(new PolygonTest());

        System.out.println("After ");
        System.out.println("Size : "+shapes.size());

        for(ShapeTest shape: shapes) {
            shape.draw();
        }

        ShapeTest polygonTest = new PolygonTest(); //Instance method to be called is decided
        polygonTest.display();  //by dynamic binding, based on the Object which the reference variable refers to.
    }
}
