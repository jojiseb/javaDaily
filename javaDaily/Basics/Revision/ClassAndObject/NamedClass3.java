
interface ShapeNamed {
     void areaOfTheShape(); //All methods are implicitly public and abstract,
    //Unless they are static and default

    default void display() {  //Default methods are introduced in interface to add new methods without
        System.out.println("Displaying Shape"); //breaking existing implementations
    }                          //Allows to provide default behaviour
}

class Circle implements ShapeNamed {
    private final double r;
    Circle(double r) {
        this.r = r;
    }
    @Override
    public void areaOfTheShape() {  //public method
        System.out.println("Area of Circle : "+(Math.PI*r*r));
    }
}

class Square implements ShapeNamed {
    private double length;
    private double breadth;

    Square(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    @Override
    public void areaOfTheShape() {
        System.out.println("Area of square : "+(length * breadth));
    }

    @Override
    public void display() {
        System.out.println("Displaying square");
    }
}

public class NamedClass3 {
    public static void main(String[] args) {
        Circle circle = new Circle(4);

        circle.areaOfTheShape();
        circle.display();

        Square square = new Square(11,12);

        square.areaOfTheShape();
        square.display();
    }
}
