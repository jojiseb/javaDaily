public class FinalizationNumber {
    public static void main(String[] args) {
        FinalizationNumber finalizationNumber = new FinalizationNumber();

        finalizationNumber = null;

        System.gc();

        System.out.println("Clean Up initiated, once");

        System.gc();   //We can see finalize() is called only once on a same object, even if the object is somehow revived

        System.out.println("Clean Up initiated, twice");

        System.out.println("Fully cleaned..");
    }

    protected void finalize() {
        System.out.println("Finalize() is called..");
    }
}
