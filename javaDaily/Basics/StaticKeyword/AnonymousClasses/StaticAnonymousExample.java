package AnonymousClasses;

public class StaticAnonymousExample {

    private static final Runnable RUNNABLE = new Runnable() {
        @Override
        public void run() {
            System.out.println("Test Run");
        }
    };

    public static void main(String[] args) {
        RUNNABLE.run();
    }
}
