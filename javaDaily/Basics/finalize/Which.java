public class Which {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Clean-up actions are performed");
    }

    public static void main(String[] args) {
        Integer s = 34;

        s = null; //getting de-referenced

        new Which(); // finalize() gets executed only when the object of Which
                    // gets executed, apart from that the finalize() of Integer object is executed as
        System.gc();    // its object s gets garbage collected

        System.out.println("Garbage collector is run");
    }
}
