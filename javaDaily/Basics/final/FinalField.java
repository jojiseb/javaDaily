
class P {
    static final int MAX_SIZE = 120;

    static final String MEASURE; //Static vars should be initialised while

    final int width; //instance vars should be initialised while declaration or constructor or instance
                //initializer block
    {
        width = 300;
    }

    static {        //declaration or in the static block
        MEASURE = "Metres";
    }
}
public class FinalField {
    public static void main(String[] args) {
        P p = new P();
        System.out.println("Size : "+P.MAX_SIZE);
        System.out.println("Measure : "+P.MEASURE);
        System.out.println("Width : "+p.width);
    }
}
