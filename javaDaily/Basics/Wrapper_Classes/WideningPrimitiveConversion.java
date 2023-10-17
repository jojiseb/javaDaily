public class WideningPrimitiveConversion {
    public static void main(String[] args) {
        //Widening primitive conversions where a primitive value that is converted is smaller than
        //the target/destination type - an automatic process

        //More like a small data is left in large container, so no risk of data loss

        byte q = 89;

        int w = q;

        float e = w;

        double r = e;

        byte p = 127;

        int h = p;  //During Widening, the smaller primitive value is placed
                        //over larger container
        byte g = -128;

        long jk = g;    //Moving to a wider primitive does not lose any information

        short v = 32767;

        float hn = v;

        short j = -32768;

        double cv = j;

        float my = 45;

        double as = my;

    }
}
