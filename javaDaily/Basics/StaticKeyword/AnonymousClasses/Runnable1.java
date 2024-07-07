package AnonymousClasses;

public class Runnable1 {

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Run run..");
        }
    };

    public static void main(String[] args) {
        Runnable1 runnable1 = new Runnable1();
        runnable1.runnable.run();
    }
}
