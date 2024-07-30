public class NumericOverflowUnderflowExample {
    public static void main(String[] args) {

        //Overflow and Underflow applies to primitive data types only.
        // Why ?? Because, they are directly mapped to low-level data-types
        //and operations supported by underlying hardware, which follows
        //fixed-width binary arithmetic rules

        //Primary data-types are designed for efficiency. Since Its wrapping around
        //, There is no compromise on performance introduced by handling overflow/underflow cases
        //...It just works normally

        int intMax = Integer.MAX_VALUE;
        int intOverflow = intMax + 1;
        System.out.println("Int Overflow : "+intOverflow);

        int intMin = Integer.MIN_VALUE;
        int intUnderflow = intMin - 1;
        System.out.println("Int Underflow : "+intUnderflow);

        long longMax = Long.MAX_VALUE;
        long longOverflow = longMax + 1;
        System.out.println("Long Overflow : "+longOverflow);

        long longMin = Long.MIN_VALUE;
        long longUnderflow = longMin - 1;
        System.out.println("Long Underflow : "+longUnderflow);

        short shortMax = Short.MAX_VALUE;
        short shortOverflow = (short) (shortMax + 1); //data-types which occupy low m/y below int
        System.out.println(shortOverflow);  //are cast to int during arithmetic operation and cast back
                                        //to store result in correct data-type. Why ??

        //These are cast to int to ensure enough precision and range to handle the results that may exceed
        //the limits since they are smaller types

        short shortMin = Short.MIN_VALUE;
        short shortUnderflow = (short) (shortMin - 1);
        System.out.println(shortUnderflow);

        byte byteMax = Byte.MAX_VALUE;
        byte byteOverflow = (byte) (byteMax + 1); //byte is 1 byte / 32-bits i.e., lesser than int.
        System.out.println(byteOverflow); //Cast to int during arithmetic operation to enable enough precision
        // and may need more range to handle the results that might exceed the limits

        //cast back to original type while storing the result

        byte byteMin = Byte.MIN_VALUE;
        byte byteUnderflow = (byte) (byteMin - 1);
        System.out.println(byteUnderflow);

        char charMax = Character.MAX_VALUE;
        char charOverflow = (char) (charMax + 1);

        char charMin = Character.MIN_VALUE;
        char charUnderflow = (char) (charMin - 1);

        float floatMax = Float.MAX_VALUE;
        float floatOverflow = floatMax * 2; //floating-pt numbers represent real no.s in
        //exponential form

        //Overflow happens when exponent becomes too large to be represented

        float floatMin = Float.MIN_VALUE;
        float floatUnderflow = floatMin / 2;
        //floating-pt numbers represent real-no.s in exponential form
        //Underflow happens when exponent becomes too low to be represented

        double doubleMax = Double.MAX_VALUE;
        double doubleOverflow = doubleMax * 2;
        //floating pt no.s represent real-numbers in exponential form
        //similar to scientific notation
        //Overflow occurs when the exponent becomes too larger to be represented

        double doubleMin = Double.MIN_VALUE;
        double doubleUnderflow = doubleMin / 2;

        //Underflow occurs when exponent becomes too low to be represented.
    }
}
