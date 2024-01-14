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

        Double dou = new Double(64.75883);

        Double df = Double.valueOf(89.36070);

        Integer vs = 4;                         //Both these are same - one is auto-boxing , other is manual conversion
        Integer d = Integer.valueOf(4);

        int cas = 45;

        check(cas);         //auto-boxing is done when passing a primitive to a method which expects a Wrapper or when
    }                       //assigning it to a Wrapper variable

    static void check(Integer it) {
        Integer gh = it;
        System.out.println("gh : "+gh);
    }
}
