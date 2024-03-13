package CheckedException;

public class SleepTest {
   /* public static void main(String[] args) {
        System.out.println("Going to Sleep...");
        Thread.sleep(50000);
        System.out.println("Wakes up !");
    }

    Compiler is checking that there is a possibility that sleep process might get interrupted
    and whether you have handled it ?

    //Here, thread might get interrupted by other threads..
    */

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Going to Sleep..");
        Thread.sleep(50000);
        System.out.println("Wakes up !");
    }
}
