package AnonymousClasses;

public class Outer_Class4 {
            //Anonymous class assigned to a private field
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Inside private anonymous");
        }
    };

    //Anonymous class assigned to a public field
    public Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Inside public anonymous");
        }
    };
    public void privateExecutable() {
        runnable.run();
    }

    public void publicExecutable() {
        runnable1.run();
    }

    public static void main(String[] args) {
        Outer_Class4 outerClass4 = new Outer_Class4();
        outerClass4.privateExecutable();
        outerClass4.publicExecutable();
    }
}
