import java.util.HashSet;
import java.util.Set;

public class NoSuchElementException {
    public static void main(String[] args) {
        Set hashSet = new HashSet();

        System.out.println("Next Item : "+hashSet.iterator().next()); // Trying to get next element when set is empty
    }               //Throws NoSuchElementException
}
