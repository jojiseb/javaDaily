package ImplicitAndExplicit;

public class ImplicitAndExplicit1 { //imagine casting as trying to fit a square peg into a circle
    public static void main(String[] args) {
        int q = 12;
        double w = q; //q is implicitly casted , automatically casted by compiler
            //since double can hold high range of values compared to int
        //double - 8 bytes, int - 4 bytes

        //This is implicit casting or widening conversion

        double d = 34.989;
//        int a = d; Here, You need to cast double type to int . After casting,

        int a = (int) d;
        System.out.println(" a : "+a); //You can see 34.989 becomes 34. decimal part is discarded
        //This is how potential data loss occurs

        //Here, compiler informs that this conversion is risky, potential data-loss might occur..a warning from side of compiler
        //Basically, handling the responsibility to developers to deal with the issue manually

        short sh = 3748; //16 bits / 2 bytes
        //byte b = sh; //8 bits / 1 byte

        //Here, We are trying to fit in a type (short) that is larger than the one used for declaration (byte)
        //This might result in information loss as some bytes will have to be discarded

        //So, compiler warns as of this and we understand the risk, accept that we are aware of it by using a cast.

        byte b = (byte) sh;

        byte test = -65;
        System.out.println("\nbyte value : "+test);
        char ch = (char) test;

        System.out.println("char value (as ch) : "+ch);
        System.out.println("int value (as int) : "+(int) ch);

        System.out.println();

        byte largeValue = (byte) 130; //Why casting to byte, if it's not any specific type ? Since it exceeds the range -128 to 127
                                        //130 overflows
        System.out.println("Large Value in byte : "+largeValue); //-126  - wrapped around value

        //Converting byte to char

        char largeValueChar = (char) largeValue;

        System.out.println("Large value in char : "+largeValueChar);

        int largeValueInInt = largeValueChar;

        System.out.println("large Value in int : "+largeValueInInt);

        byte backToByte = (byte) largeValueInInt;

        System.out.println("back to byte : "+backToByte);
    }
}
