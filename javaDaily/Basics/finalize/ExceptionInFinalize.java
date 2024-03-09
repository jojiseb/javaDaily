public class ExceptionInFinalize {
    public static void main(String[] args) {
        ExceptionInFinalize exception = new ExceptionInFinalize();

        exception = null;

        System.gc();    //finalize() gets called

        System.out.println("GC getting started.. !");
    }

    protected void finalize() {
        System.out.println("Starting clean-Up");
        int f = 1/0; // Code upto issue gets executed...If error occurs they
        System.out.println("Finished !"); //are ignored by gc.
    }

    //When error occur inside finalize, its ignored (not handled) and cleanup is not completed
}
