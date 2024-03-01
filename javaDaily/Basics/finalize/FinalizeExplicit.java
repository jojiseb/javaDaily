public class FinalizeExplicit {

    protected  void finalize() {
        System.out.println("finalize() called !!! ");
    }

    public static void main(String[] args) {
        FinalizeExplicit finalizeExplicit = new FinalizeExplicit();
        FinalizeExplicit finalizeExplicit1 = new FinalizeExplicit();

        finalizeExplicit = null;

        finalizeExplicit1.finalize(); //Explicit call to finalize()

        System.out.println("No GC, just like a normal method invocation");

        System.gc();    //Implicit call to finalize()

        System.out.println("GC happens ! ");
    }
}
