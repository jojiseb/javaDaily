import java.util.ArrayList;
import java.util.List;

public class Wrapper_Class2 {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        Double d = 75.833;
        Integer e = 23;
        numbers.add(d);
        numbers.add(e);

        double total = 0;
        for(Number number: numbers) {
            total += number.doubleValue();
        }

        System.out.println("Total : "+total);
    }
}
