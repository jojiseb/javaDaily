public class LossyConversions {
    public static void main(String[] args) {

            //Possibly occur when trying to assign value of larger type to a smaller type
        long q = 12;    //long - 8 byte i.e., 64 bits

        System.out.println(q);

//        int w = q;      //int - 4 byte i.e., 32 bits

        int w = (int) q;    //Even if 12 is within int range, compiler demands explicit conversion to give user voluntary choice of data loss
                            //  It's kind of an approval from user, that they are aware , go ahead and perform the conversion
        System.out.println(w);

        //Possible lossy conversion error/warning from long to int - Since, there can be long values outside
        //int range

        float e = 23.56f;  //float - 4 bytes
//        long r = e;         //long - 8 bytes

        long r = (long) e;

        //Possible lossy conversion error/warning from float to long - Since, float can have decimal values
        //that don't have corresponding long value

        double t = 565.78;  //double - 8 bytes
//        int y = t;          //int - 4 bytes

        int y = (int) t;

        double u = 9.5;
//        int i = u;

        int i = (int) u;

        // Possible lossy conversion error from double to int - double values
        //can be too large or too small and decimal values can get lost in conversion

        //More examples on lossy conversion

        long p = 234;   //long - 8 bytes, int - 4 bytes , Reason 1: There can be long values outside int range
//        int o = p;
        int o = (int) p; // denoting manual conversion made by user consciously even after knowing loss of values, even if
                            // 234 is well within int range

        float l = 45.811f;  //float - 4 bytes, long - 8 bytes
        //long k = l;
        long k = (long) l; //lossy conversion since, decimal values of float doesn't have corresponding values in long

        float j = 90.58f; //float - 4 bytes, int - 4 bytes
        //int h = j;
        int h = (int) j;   //decimal values of float doesn't have corresponding values in int , So, end up lossy

        double g = 4444.6657;   // double values can be
        //int d = g;
        int d = (int) g; //double values can be too long or too short &
                            //decimal values can get lost in conversion

        double v = 1.1;
        //int a = v;
        int a = (int) v;

        double pi = 3.14;
        System.out.println("Double : "+pi);
        long z = (long) pi;
        System.out.println("Long : "+z);

        //If you are aware of loss of information, then you can choose to cast
        //datatype to specify

        //Casting doesn't always mean a data loss, it just means you are aware
        //of conversion

        //Lossy conversions possibly occur when narrowing - larger to smaller datatype
        //Here, Either it falls out of range / decimal values get truncated

        //Major Example: Fahrenheit to Celsius

        int fa = 100;
        int cel = (fa - 32) * 5 / 9;    //100 - 32 = 68 --> 68 * 5 = 340 --> 340/9 = 37.7778..
        System.out.println("Cel if int used : "+cel);   //37 is taken, rest are truncated, not even rounded

        //So we use double

        int fah = 100;
        double res = (fah - 32)  * 5.0 / 9.0;   //double constants 5.0 & 9.0
        System.out.println("Temperature : "+res);   //37.77777777777778

        //what if I use float ??
        int fh = 100;
        float tempRes = (fh - 32) * 5.0f / 9.0f;
        System.out.println("Temp in float : "+tempRes); //37.77778
    }
}
