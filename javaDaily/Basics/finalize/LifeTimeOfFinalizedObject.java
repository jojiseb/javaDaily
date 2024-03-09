public class LifeTimeOfFinalizedObject {
    public static void main(String[] args) {
        LifeTimeOfFinalizedObject finalizedObject = new LifeTimeOfFinalizedObject(); //Object is created

        finalizedObject = null; //Object is un-referenced/un-reachable. Now, This object is of no use and occupies unnecessary space in m/y.

        System.gc();   //Object is added to finalization queue of garbage collector, which is invoked by JVM

        System.out.println("Finalization done..");

        //GC destroys the object completely & re-claims the space occupied by un-used object
    }

    protected void finalize() {         //Clean-up activities are performed & object is finalized
        System.out.println("Finalize is called..");
    }
}
