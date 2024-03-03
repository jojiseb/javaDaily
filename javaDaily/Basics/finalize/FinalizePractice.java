public class FinalizePractice {

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Removing the objects..");
        }
        catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        finally {
            super.finalize(); //To avoid forgetting finalize() call of super class
        }
    }

    public static void main(String[] args) {
        FinalizePractice f = new FinalizePractice();

        f = null;

        System.gc();

        System.out.println("Finalizing...");
    }
}
