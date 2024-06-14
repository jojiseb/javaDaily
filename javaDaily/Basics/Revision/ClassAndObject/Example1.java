public class Example1 {
    public static void main(String[] args) {
        Thread threadTest = new Thread() {
            {
                setName("Custom Name for Thread");
                setPriority(Thread.NORM_PRIORITY);
                System.out.println("Initialized..");
            }

            @Override
            public void run() {
                System.out.println("Let's start running..");
                System.out.println("Name of thread : "+getName());
                System.out.println("Priority of Thread : "+getPriority());
            }
        };

        System.out.println("Lets run");
        threadTest.start();
    }
}
