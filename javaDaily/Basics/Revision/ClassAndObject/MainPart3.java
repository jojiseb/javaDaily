import java.util.Arrays;

class Shape {
    private int id;
    private String name;

    public void setId(int i) {
        this.id = i;
    }
    public void setName(String name) {
        this.name = name;
    }

    Shape() {

    }
    Shape(int i, String name) {
        this.id = i;
        this.name = name;
    }
    @Override
    public String toString() {
        return "No : "+this.id+", Name : "+this.name;
    }
}
public class MainPart3 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);  //Since, we have overridden toString(), default value of instance variables gets displayed
        //gets displayed instead of className and hashCode which represents the m/y location.

        //Default - No : 0, Name : null -- If instance variables doesn't have any values assigned, default will get selected

        //Now, Changing default value of shape object - ref.variable shape
        shape.setId(2);
        shape.setName("Square");

        //Changed values of instance variables
        System.out.println(shape);


        Shape shape1 = new Shape(1, "Circle");  //Using parameterised constructor
        System.out.println(shape1);

        Shape[] shapes = new Shape[2]; //Declaring ref.variable where an Object can be assigned to each
        System.out.println(Arrays.toString(shapes));    //[null,null] - Since, not referring to any objects

        for (Shape shape2: shapes) {
            shape2 = new Shape();
            System.out.println("After assigning a value : ");
            System.out.println(shape2); //default values are shown instead of ClassName & m/y address since toString() is overridden
        }
    }
}
