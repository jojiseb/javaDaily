package AnonymousClasses;

public class Outer_Class1 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() { //Anonymous class local to a method
          @Override
          public void run() {
              System.out.println("Run by Anonymous Class local to a method !");
          }
        };

        runnable.run();
    }
}
