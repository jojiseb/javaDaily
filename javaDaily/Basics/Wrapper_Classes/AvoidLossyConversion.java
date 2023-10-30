
public class AvoidLossyConversion {
    static long l = 24;
    static short num;

    public static void main(String[] args) {
        //Conversion techniques to avoid lossy conversion :
        //  --> Converting btw primitive types - Down casting
        //  --> Converting btw wrapper objects & primitive types
        //  --> Converting btw Wrapper Objects

        //Down casting - cast larger type to smaller type
    }

    public short getNum(long l) {
        num = (short) l;
        return num;
    }
}
