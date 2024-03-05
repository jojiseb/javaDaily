public class FinalizeDemo {

    protected void finalize() throws Throwable {
        try {
            System.out.println("Inside finalize()");
        }
        catch (Exception e) {
            throw e;
        }
        finally {
            System.out.println("Executing finally..");
            super.finalize();
        }
    }

    public static void main(String[] args) throws Throwable {
        FinalizeDemo finalizeDemo = new FinalizeDemo();
        finalizeDemo.finalize(); //Here, finalize() is called explicitly
    }

}
