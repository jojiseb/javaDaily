package ImplicitAndExplicit;

public class ImplicitAndExplicit4 {
    public static void main(String[] args) {
        byte z = (byte) 130; //-126 --> 10000010
        System.out.println("byte z : "+z);
        char c = (char) z; //byte to char is supposed to be widening since byte
                            //is 8-bit and char is 16-bit. So, explicit handling happens
        //here because byte is signed and char is unsigned. It first widens byte to int to preserve
        //the sign and then narrows down to char

        //11111111 11111111 11111111 10000010 widening to int
        //11111111 10000010 narrowed to char

        System.out.println("char c as char : "+c);

        int in = c; //65410
        System.out.println("visualizing char value as int : "+in);

        byte fi = (byte) in; //-126
        System.out.println("byte : "+fi);


        //Now when starting with char

        char ch = 130; //00000000 10000010

        System.out.println("char ch : "+ch);

        int num = ch;
        System.out.println("num : "+num); //00000000 10000010

        byte by = (byte) ch; //-126 -- 10000010 , last 8-bit is considered

        System.out.println("byte by : "+by);

        byte byy = (byte)  num; //-126
        System.out.println("byte byy : "+byy); //10000010
    }
}
