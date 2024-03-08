public class DemoCheck {
    public static void main(String[] args) throws Throwable {
        DemoCheck demoCheck = new DemoCheck();
        DemoCheck demoCheck1 = new DemoCheck();

        demoCheck = demoCheck1;

        System.out.println("GC is getting called");

//        demoCheck.finalize(); //Compiler ignores finalize() as it is called explicitly here
        System.gc(); //and not invoked normally like it used to be using System.gc() (Implicit call)

        System.out.println("GC called");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing..");
    }
}
