public class InstanceInitializer9 {
    private double length;
    private double breadth;
    private double radius;

    {                   //We can also use Initializer block to
        length = 0;     //apply complex initialization logic
        length = 0;
        breadth = 0;
        radius = 70;

        area();
    }
    public void area() {
        if(length > 0 && breadth > 0) {
            if(length != breadth) {
                System.out.println("Area of Rectangle : "+(length * breadth));
            }
            else {
                System.out.println("Area of Square : "+(length * breadth));
            }
        }

        if(radius > 0) {
            System.out.println("Area of Circle : "+(Math.PI * radius * radius));
        }

    }
    public static void main(String[] args) {
        new InstanceInitializer9();
    }
}
