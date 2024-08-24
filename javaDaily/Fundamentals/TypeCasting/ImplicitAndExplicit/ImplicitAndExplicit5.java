package ImplicitAndExplicit;

public class ImplicitAndExplicit5 {
    public static void main(String[] args) {
        byte b = (byte) 230;
        System.out.println("Byte b : "+b);  // -26 -- 00011010

        char ch = (char) b; //Even thought char is 2 bytes - 16 bits, we perform casting since
        //char is unsigned and byte is signed

        System.out.println("char ch : "+ch);

        int i = ch; //11111111 11111111 11111111 00011010 This internal widening to int happens
        // when widening byte to char to preserve sign, avoid data loss and also
        // standardize arithmetic operations

        //In the step followed, it is narrowed down to char from int to char
        //which is from 32 to 16 bits. Therefore, Last 16 bits is preserved and others are removed

        //Therefore, resultant bits are : 11111111 00011010 --> 65510 when representing char as int

        System.out.println("int rep. as char ch : "+i);

        byte finalby = (byte) i;

        System.out.println("byte final : "+finalby); //11111111 00011010 becomes 00011010 --> -26 basically
                                                    //the original value that we used.

        //Let's check some other way...If we are using char instead of byte in beginning

        char c1 = 230;

        System.out.println("char c1 : "+c1); //230

        int in = c1;

        System.out.println("char rep. as int in : "+in); //230 ....So, When representing char as int also original value is maintained

        byte by = (byte) in;
        System.out.println("Narrow to byte : "+by); //-26 -- 00000000 00000000 00000000 11100110 --> 11100110

            //Other bits are stripped off since byte is 8 bits

        //We can assume that byte representations are same , but char representations seem to vary

        byte bq = (byte) 300;
        System.out.println("byte bq : "+bq); //44

        char cha = (char) bq;
        System.out.println("char cha : "+cha);

        int c2 = cha;

        System.out.println("char as int c2 : "+c2); //44 Since 44 is well withing range of byte

        byte bv = (byte) c2;
        System.out.println("bv : "+bv); //44 Since 44 lies within byte range...This works

        //Now, Start using char

        char cb = 300;

        System.out.println("char cb : "+cb);

        int n = cb; //300 - 100101100

        System.out.println("int n : "+n);

        byte rt = (byte) n; // Now, byte is 8-bit, others are stripped off --> 0010 1100 = 44
        System.out.println("rt : "+rt);

        //New Example ----

        byte r = (byte) 190;
        System.out.println("byte r : "+r); // -66

        char t = (char) r;
        System.out.println("char t : "+t);

        int y = t;                          // 11111111 11111111 11111111 10111110 This internal widening to int happens to preserve value
        System.out.println("Char as int : "+y); //avoid data loss , preserve signed ness
                                        // When narrow down to char, 16 bits ...last 16 is kept
                                        // 11111111 10111110 --> 65470

        byte g = (byte) y;
        System.out.println("again byte : "+g); //-66 --> only 8 bits now , 10111110
    }
}
