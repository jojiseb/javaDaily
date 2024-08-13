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

        System.out.println("int i : "+intValue);

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

    }
}
