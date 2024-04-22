
import java.util.Vector;
public class VectorEx {
    public VectorEx() { //java.util.vector is imported, since able
        Vector newVector = new Vector();    //to use directly in code

        //java.util.ArrayList is not imported, hence we refer to it using
        //complete package
        java.util.ArrayList newList = new java.util.ArrayList<>();

        System.out.println("vector and arraylist is created !");
    }
    public static void main(String[] args) {
        new VectorEx();
    }
}
