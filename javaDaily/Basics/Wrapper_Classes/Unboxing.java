import java.util.ArrayList;

public class Unboxing {
    public static void main(String[] args) {
        Integer i = 45;
        System.out.println(i);

        int j = i;
        System.out.println(j);

        Character h = '\n';
        char m = h;     //auto converting Wrapper to primitive object

        ArrayList<Integer> num = new ArrayList<>();
        num.add(i);

        int out = num.get(0);   //Unboxing - automatic converting Object to primitive,
        System.out.println(out);            //since get() returns Integer object
    }           //printing prim values
}
