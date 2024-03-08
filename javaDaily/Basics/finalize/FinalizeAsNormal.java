public class FinalizeAsNormal {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Clean up initiated...");
    }

    public static void main(String[] args) throws Throwable {
        FinalizeAsNormal finalize = new FinalizeAsNormal();
        FinalizeAsNormal finalize1 = new FinalizeAsNormal();

        finalize = finalize1;

//        System.gc();

        finalize.finalize(); //Here, finalize() is called as normal function call,
                            //No GC is performed..
        System.out.println("Finished GC ing"); //You can notice finalize() code executed just when it was invoked

        //Normally, it tooks some time to call while calling using System.gc() or some other way
    }
}
