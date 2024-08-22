import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassEx2 {
    public static void main(String[] args) {
        int i1 = 12;
        Integer w1 = Integer.valueOf(i1); //valueOf() method is more preferred
                //As it may return cached value for small values (-128 to 127)

        Integer w2 = new Integer(i1);

        //As you see you can use 2 methods , valueOf() and new Integer()
        //new Integer() is old one, has overhead of object creation and deprecated
        //So, valueOf() is more preferred and efficient as it caches frequently requested values
        //eventually saving memory as no new object created like new Integer(int)

        //Methods across Wrapper classes

        //1.valueOf() --> to convert primitive datatypes to their respective wrapper objects

        Integer it = Integer.valueOf(56); //4 byte (32-bit)

        System.out.println("it : "+it);

        Boolean boo = Boolean.valueOf(false);  //1 bit

        System.out.println("boo : "+boo);

        byte b = 100; //8 bit (-127 to 128)

        Byte by = Byte.valueOf(b);

        //As you can see, valueOf() converts each of primitives to their corresponding
        //Wrappers

        long l = 284784757857857586L; //8 byte - 64 bits
        Long lo = Long.valueOf(l);

        float f = 875.587f;         //4 byte - 32 bits
        Float fi = Float.valueOf(f);

        double d = 8978.657777;
        Double dou = Double.valueOf(d); //8 byte - 64 bits

        //2.parsing methods (For converting String to corresponding primitives)

        String s1 = "345";
        System.out.println("s1 : "+s1+", Class : "+s1.getClass());
        int p1 = Integer.parseInt(s1);
        System.out.println("p1 : "+p1);

        String s2 = "true";
        boolean bo = Boolean.parseBoolean(s2);

//        int p2 = Integer.parseInt(s2); //Here, Number format exception is thrown
            //Because, I am not passing a String which contains a parsable integer

        //The String s2 contains a parsable boolean which needed to be passed to parseBoolean()

        String num = "23.566";
//        int ite = Integer.parseInt(num); //Cause NumberFormatException as I am passing parsable double
                //value as String to parseInt()

        double du = Double.parseDouble(num);

        String ot = "845784758474574875858"; // This exceeds long integer limit....long has 19 digits capacity
//        long lg = Long.parseLong(ot); //This String doesn't contain a parsable Long, which is
                                //why it causes NUmberFormat Exception.
        //What this needs is Double.parseDouble() since this String contains a parsable Double

        //Why ?? Even though this String seems like it includes a long integer value without any decimal parts,
        //it seems like long is the parsable primitive in action. But here, its actually out of the range of long data type.

        //Now, Even though both long and double, both are 8 bytes each, double is able to manage more numeric vales to wider range,
        // including very large numbers than long because it uses floating point representation.

        long max = Long.MAX_VALUE;
        System.out.println("Max : "+max);
        System.out.println("Min : "+(Long.MIN_VALUE));

        float fl = 3458.4354664F;

        Float ite = Float.valueOf(fl); //valueOf() preferred when converting primitive to Wrapper object since its
            //more efficient , performs caching for frequently requested values, so better performance

        Float f1 = new Float(fl); //deprecated, unrecommended, since its creating new object everytime
        //taking up memory

        String st = "78447586.446768576";
        float f2 = Float.parseFloat(st); //parseMethod() to convert String to primitive values

        String l2 = "8567895765979579784";
//        int io = Integer.parseInt(l2); //Will throw NumberFormatException since this String includes parsable long instead
        //of parsable int

        long io = Long.parseLong(l2);

        String po = "false";

        boolean bl = Boolean.parseBoolean(po); //converts String to primitive type float

        Integer intV = 3556;

        int itr = intV.intValue(); //Integer,intValue() converts Wrapper's to
        // corresponding primitives

        Float fg = 35.6587f;
        float y = fg.floatValue(); //returns float value of Float object

        Boolean bn = true;

        boolean g = bn.booleanValue();

        boolean h = Boolean.TRUE;

        List<Boolean> booleanList = new ArrayList<> ();
        booleanList.add(null);
        booleanList.add(Boolean.TRUE);
        booleanList.add(Boolean.FALSE);

        boolean val;

        for (Boolean bool: booleanList) {
            val = (bool != null) ? bool.booleanValue() : false;
            System.out.println("val : "+val);
        }

        Double df = 98596865954.56576744;
        double di = df.doubleValue(); //getting primitive from wrapper

        int num1 = 56;
        int num2 = 45;
                                //Integer.compare() -- for comparing primitive values
        int res = Integer.compare(num1, num2); //return 0 if num1 == num2 ,
                                    // -1 if num1 < num2
                                    // 1 if num1 > num2
        System.out.println("res : "+res); //1

        int it1 = 11;
        int it2 = 11;
        //We need to compare 2 primitive values , So we use Integer.compare()
        int res2 = Integer.compare(it1, it2); //returns 0 since it1 == it2

        System.out.println("res2 : "+res2);

        int iy = 566;
        int ui = 1000;

        int res3 = Integer.compare(iy,ui); //returns -1 since iy < ui

        System.out.println("res3 : "+res3);

        //So, Integer.compare(int1 , int2) for comparing primitive types

        //Returns 0 if int1 == int2
        //       -1 if int1 < int2
        //        1 if int1 > int2

        boolean b1 = true;
        boolean b2 = false;

        int br = Boolean.compare(b1, b2);

    }
}
