public class WrapperToPrimitive {
    public static void main(String[] args) {

        //Each wrapper class provides methods to explicitly retrieve primitive values
                //These methods returning primitive types which are expected as response

        Integer q = 56;

        int w = q.intValue();   //Wrapper value q (56) converted to primitive type w

        Float e = 100f;

        float r = e.floatValue();

        //One way to use auto-unboxing and other is using Wrapper class methods

        Integer u = 67;

        int g = u; //auto-unboxing - conversion of wrapper to its corresponding primitives

        Integer j = 90;

        int h = j.intValue();

        Double v = 74.7753;

        double z = v.doubleValue();

        Double b = 55.78;

        double xc = b; //auto-unboxing

        Integer item = 444;

        check(item);    //Auto-unboxing is done when passing a wrapper to a method that expects a primitive or
    }                   //when assigning it to a primitive variable

    static void check(int num) {
        System.out.println("Num : "+num);
    }
}
