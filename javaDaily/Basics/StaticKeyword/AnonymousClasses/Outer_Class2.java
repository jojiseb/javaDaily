package AnonymousClasses;

public class Outer_Class2 {
    public static void main(String[] args) { //Using Anonymous Inner class that defines inside
        Thread thread = new Thread(new Runnable() { //constructor argument
            @Override   //Runnable implementation for a new Thread instance
            public void run() {
                System.out.println("Argument of a constructor");
            }
        });

        thread.start();

        System.out.println("Outside Thread..");
    }
}
