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


    }
}
