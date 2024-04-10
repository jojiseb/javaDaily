import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(12);
        elements.add(13);
        elements.add(14);

        Iterator<Integer> iterator = elements.iterator();

        while(iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("Value : "+value);
            if(value.equals(14)) {
                elements.remove(value);
            }
        }
    }
}
