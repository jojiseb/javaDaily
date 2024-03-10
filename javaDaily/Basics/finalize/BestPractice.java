import java.io.Closeable;

public class BestPractice {
    public static void main(String[] args) {
        BestPractice bestPractice = new BestPractice();

        bestPractice = null;

        System.gc();

        System.out.println("GC is done");
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Release resources here..");
            int k = 2/0;
        }
        catch(Throwable t) {
            System.out.println(t.getMessage());
            throw t;
        }
        finally {
            super.finalize();   // Make sure finalize() is executed even
        }                       // exception is caught
    }
}
