public class Second {
    public static void main(String[] args) {
        int num = 20; //occupies 32-bits in memory --> So, 4 bytes

        byte b = 10; //Compact datatype -- Occupies 8-bits in memory --> 1 byte

        short sh = 9; //occupies 16-bits in m/y , So, 2 bytes

        //byte < short < int

        //1 byte < 2 bytes < 4 bytes

        //8-bit per byte

        long lo = 8384373854858L;   //For handling vast numbers, which can't be handled
                                //by int datatype

            // Occupies 64-bits in m/y --> 8 bytes

        double dou = 435.96659865893948953424; //For handling vast floating point numbers, which
                                //can't be handled by float datatype

        System.out.println(dou); //435.9665986589395

        //double is used when high precision is required
        //More precise than float

            //Occupies 64-bits in m/y --> 8 bytes
            //Provides 15-16 digits of precision

        float fl = 3454.6657759f;

        //Occupies 32-bits in m/y --> 4 bytes
        //Provides 6-7 digits of precision

        System.out.println(fl); //3454.6658

        //float is more performant compared to double

        //Use float when m/y is a concern and high performance is required
    }
}
