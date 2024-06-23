package objectAndClass;

abstract class Shape {
    String objectName;
    Shape(String name) {
        this.objectName = name;
    }
    public void moveTo(int x, int y) { //Common code to all sub-classes
        System.out.println(this.objectName+" has been moved to x = "+x+", y = "+y);
    }

    abstract public void draw(); //Implemented by sub-classes
    abstract public double area(); //Implemented by sub-classes
}

class Rectangle extends Shape{
    int length,width;

    Rectangle(int length, int width, String name) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn");
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Square extends Shape {
    int length;
    Square(int length, String name) {
        super(name);
        this.length = length;
    }
    @Override
    public void draw() {
        System.out.println("Square is drawn");
    }
    @Override
    public double area() {
        return length * length;
    }
}

class Circle extends Shape{
    double pi = 3.14;
    int radius;
    Circle(int radius, String name) {
        super(name);
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }
    @Override
    public double area() {
        return pi * radius * radius;
    }
}

public class AbstractShape {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4,6, "Rectangle");
        rectangle.draw();
        System.out.println("Area of Rectangle : "+rectangle.area());

        rectangle.moveTo(12, 6);

        Shape sq = new Square(7, "Square");
        sq.draw();
        System.out.println("Area of Square : "+sq.area());

        sq.moveTo(10, 40);

        Shape circle = new Circle(4, "Circle");
        circle.draw();
        System.out.println("Area of Circle : "+circle.area());

        circle.moveTo(9, 18);
    }
}
