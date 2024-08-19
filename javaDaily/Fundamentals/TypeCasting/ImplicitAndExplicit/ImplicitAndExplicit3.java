package ImplicitAndExplicit;

public class ImplicitAndExplicit3 {
    public static void main(String[] args) {

        byte q = -65;

        System.out.println("byte q : "+q); // 10000011 in binary

        //Widening and Narrowing

        //1. Widening to int (internal operation)

        // When widening to int, Java performs Sign expansion. Sign expansion means
        // sign bit of byte (leftmost bit) is extended across new bits in int to preserve the value's sign.

        // '10000011' becomes '11111111 11111111 11111111 10000011'

        //2. Narrowing from int to char

        // While narrowing from int to char, Java simply takes lower 16 bits of int and discards rest
        //Since, char is unsigned, the value is interpreted as a positive number, regardless of whether
        //the original int is positive or negative

        // Therefore, From '11111111 11111111 11111111 10000011',
        // the lower 16 bits are '11111111 10000011' !

        //'11111111 10000011' corresponds to 65421 in char

        int in = q;

        System.out.println("int value : "+in);

        char ch = (char) q;

        System.out.println("Char value (as char) : "+ch);

        int f = ch;

        System.out.println("Final Char : "+f); //65421

        char anotherWay = (char) in;

        System.out.println("Char last : "+(int) anotherWay);

        //Now, how is char able to manage int when narrowed down ???

        //When narrowing int to char, only the lower 16 bits are kept, rest higher 16 bits
        //are discarded. This truncation means any info regarding the sign of original int
        //is also lost. So, Result will be a positive value when stored in char

        //char simply represents the numeric value of bit pattern, it doesn't have a sign bit

        System.out.println("\nAnother test..");

        byte w = (byte) 130;

        System.out.println("\nbyte w : "+w); //displays -126 instead of 130 since 130 is out of range
        // -128 to 127 of byte. So, It will just wrap around within limit to -126

        int i1 = w;

        System.out.println("int value , i1 : "+i1);

        char ca = (char) w;
        System.out.println("char value (as char) : "+ca);

        System.out.println("Char value (as int) : "+(int) ca); //representing the char as int will be a positive integer, since char is un-signed
                            //So This will show the range


    }
}
