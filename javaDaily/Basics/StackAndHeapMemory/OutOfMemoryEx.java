import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryEx {
    public static void main(String[] args) {
        try {
            List<Object> numbers = new ArrayList<>();

            while(true) {   //Adding Objects to heap, more than the heap space
                numbers.add(new Object());
            }       //Heap space gets exhausted when tried to add new objects to the list
        }
        catch (OutOfMemoryError e) {
            System.out.println("Out Of Memory Error occurred.."+e.getMessage());
        }
    }
}
