public class NarrowingPrimitiveConversion {
    public static void main(String[] args) {
        //Narrowing primitive conversion is where the primitive that gets converted is larger than
        //target/destination type

        //Risk of data-loss exists due to conversion from large to small types

        //So, We need to explicitly express that we are aware of data-loss , and use cast correctly

        long q = 678988900;

        System.out.println("long q : "+q);

        int w = (int) q;    //lossy conversion, so we explicitly cast to denote we are aware & okay with it

        System.out.println("int w : "+w);

        int e = 567;

        System.out.println(e);

        byte r = (byte) e;

        System.out.println(r);

        short t = (short) e;

        System.out.println(t);

        double df = 765.78;
        System.out.println(df);
        int jl = (int) df;

        System.out.println(jl);

        long hk = (long) df;

        System.out.println(hk);
    }
}
