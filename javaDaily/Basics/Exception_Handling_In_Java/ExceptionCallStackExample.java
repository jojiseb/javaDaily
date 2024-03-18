public class ExceptionCallStackExample {
    public static void main(String[] args) {
        System.out.println("Inside Main()");
        methodA();
        System.out.println("Finished..");
    }

    public static void methodA() {
        System.out.println("Inside methodA()");
        methodB();
        System.out.println("Back to main()");
    }

    public static void methodB() {
        System.out.println("Inside methodB()");
        methodC();
        System.out.println("Back to methodA()..");
    }

    public static void methodC() {
        System.out.println("Inside methodC()");
        int number = 10/0;  //Here, We can see exception occurred at line 22 in methodC(), which then propagates back to find a handler code
        System.out.println("Number : "+number); //all the way back through the methods which were called to reach this exception.

        System.out.println("Going back to where it all started.."); // Now, Exception is displayed as in main(), because there was no handler code
    }                                               // So, Code execution is stopped after line 22 in methodC()
}
