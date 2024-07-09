package AnonymousClasses;

public class Outer_Class5 {
    public static void main(String[] args) {
//        private Runnable r = new Runnable() {
//            @Override     //Access modifier inside a method isn't
//            void run() {  //allowed in java
//                System.out.println("Running..");
//            }
//        };

         Runnable runn = new Runnable() { //Declared inside method
            public void run() {
                System.out.println("Run test");
            };
        };
         runn.run();
    }
}
