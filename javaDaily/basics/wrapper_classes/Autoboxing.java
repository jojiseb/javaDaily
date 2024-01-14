import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(num);
        Integer Number = num;
        System.out.println(Number);

        char c = '3';
        System.out.println(c);
        Character ch = c;
        System.out.println(ch);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(num); //adding num, i.e., 4 which is an int to Integer conversion //Autoboxing takes place

        System.out.println(numbers.get(0));
    }
}
