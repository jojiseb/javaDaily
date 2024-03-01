public class FinalizeEx1 {

    protected void finalize() {
        try {
            System.out.println("Removing String Object...");
        }
        finally {
            System.out.println("Removed String");
        }
    }

    public static void main(String[] args) {
        String a = "Hello";

        a = null;

        System.gc();
        System.out.println("Garbage Collector..");

        //Here, It won't print the code inside finalize() because gc makes a call to
        //finalize() method of that class, which is eligible for garbage collection. Here,
        //s is object of String class. So, finalize() of String class is called
    }
}
