public class Demo {

    protected void finalize() throws Throwable{
        try {
            System.out.println("Finalize initiated...");
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        finally {
            System.out.println("Calling finalize() of Object....");
            super.finalize();
        }
    }

    public static void main(String[] args) throws Throwable{
        Demo demo = new Demo();

        demo.finalize();
    }
}
