package ImplicitAndExplicit;

public class ImplicitAndExplicit2 {
    public static void main(String[] args) {
        //Widening first and then narrowing , happens when byte converted to char

        //Why ? Because byte and char not compatible in terms of signed-ness or bit-range

        //byte - A signed 8-bit integer
        //char - An un-signed 16-bit integer

        //So, Java widens byte to an int. Java uses int as an intermediate step since char can't directly hold a signed byte !
        // In the next step, it is then narrowed down to char.
        // Now, This narrowing operation involves converting the int value (which now represents byte value) to a char

        byte by = -65; //ASCII for A
        System.out.println(" byte by : "+by);

        char ch = (char) by; //int i = by; --> something similar behind the scenes
        //And int is converted back to char, so that value is maintained

        System.out.println("char ch : "+ch);

        int intValue = by;

        System.out.println("int intValue : "+intValue);

        char newChar = (char) intValue;

        System.out.println("After narrowing from int to char..");

        System.out.println("New char : "+(int) newChar);

        //Now, Why is byte widened to int first ?? cuz int is large enough to hold
        //all possible values of byte without any information loss
        //And then it is narrowed from int to char, ensuring that value fits within char's range


        System.out.println("\nExample of short to char..");


        short q = -400;

        System.out.println("short q : "+q); //-400

        int intVal = q;

        System.out.println("int value : "+intVal);

        char ct = (char) q;

        char rt = (char) intVal;

        System.out.println("char value , ct : "+ct);

        System.out.println("New Char : "+(int) rt);


        //Another example of byte converted to int,

        System.out.println();

        byte s = (byte) 130; //explicit conversion here, since 130 exceeds byte range
                            //-128 to 127

        System.out.println("byte s : "+s);

        int num = s;

        System.out.println("Int value num : "+num);

        char c = (char) s; //Widen to int happens internally and then narrowed down to char

        //This happens because there is difference between signed-ness and bit-range of both types
        //byte and char. byte is 8-bit signed and char is 16-bit un-signed

        //byte widens first to int since char can't directly hold its signed value due to its unsigned-ness.
        //In next step, it is narrowed down from int to char
        //Now, this involves byte stored in int converted to char
        System.out.println("char c : "+c);

        System.out.println("char value as int : "+(int) c);


    }
}
