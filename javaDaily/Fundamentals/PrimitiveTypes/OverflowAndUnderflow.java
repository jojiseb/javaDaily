public class OverflowAndUnderflow {
    public static void main(String[] args) { // int range = 2^-31 to 2^31 - 1
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println("Max : "+maxValue);
        System.out.println("Min : "+minValue);

        System.out.println("Overflow test ...add 1 to maxValue");

        System.out.println(maxValue + 1); //Integer value is wrapped around within its fixed range
                                //due to 2's compliment representation used for signed integers
                            //(2^31 - 1)  ---> 2,147,483,647 + 1 = -2,147,483,648

        //So, When maxValue is incremented, it wraps around the minimum value

        System.out.println("Underflow test..subtract 1 from min. value");

        System.out.println(minValue - 1); //Integer value is wrapped around within its fixed range
                                //due to 2's compliment representation used for signed integers
                            //(2^31) ---> -2,147,483,648 - 1 = 2,147,483,647

        //So, When minValue is decremented, it wraps around the maximum value


        //This wrapping behaviour is due to fixed bit length of integer representation.
        //So, When an arithmetic operation results in a value outside the range, the value "wraps around" within this range,
        //performing a modulo 2^32 operation.


        //This is helpful so that binary arithmetic implementation used in hardware doesn't need to handle
        //overflow or underflow, but just continue working within the defined bit range without worrying about
        //exception handling, additional circuitry

        //Everything can keep working just as it is !


    }
}
