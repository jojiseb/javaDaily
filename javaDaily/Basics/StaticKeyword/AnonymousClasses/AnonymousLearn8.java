package AnonymousClasses;

public class AnonymousLearn8 {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() { //Anonymous class as an
            @Override       //argument to constructor call
            public void run() {
                System.out.println("Running in thread...");
            }
        });

//        th.run();
        th.start();
    }
}
