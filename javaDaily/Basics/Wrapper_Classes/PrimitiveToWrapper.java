import java.util.ArrayList;
import java.util.List;

public class PrimitiveToWrapper {
    public static void main(String[] args) {
        //Methods to convert primitive to wrapper

        //Using constructors or static factory methods

        Integer q  = new Integer(3);

        Integer w = Integer.valueOf(2);


        //Usage of factory methods are recommended since constructors
        //are mostly deprecated

        //valueOf() returns cached value, makes it more efficient

        byte b = 34;

        Byte by = Byte.valueOf(b);

        char c = '8';

        Character character = Character.valueOf(c);

        char ch = '\n';

        Character character1 = Character.valueOf(ch);

        System.out.println(character+", "+character1);

        Integer num = 7;    //primitive to Wrapper - autoboxing

        List<Character> characters = new ArrayList<>();
        characters.add('2');    //autoboxing

        //Here,Internal usage of valueOf() to facilitate conversion



    }
}
