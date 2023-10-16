public class NarrowingPrimitiveConversion {
    public static void main(String[] args) {
        //Narrowing primitive conversion is where the primitive that gets converted is larger than
        //target/destination type

        //Risk of data-loss exists due to conversion from large to small types

        //So, We need to explicitly express that we are aware of data-loss , and use cast correctly

        int w = 78;

        byte by = (byte) w;
    }
}
