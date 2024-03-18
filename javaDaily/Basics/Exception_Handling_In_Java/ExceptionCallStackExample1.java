public class ExceptionCallStackExample1 {
    public static void main(String[] args) {
        System.out.println("In main()");
        methodA();
        System.out.println("Finished..");
    }

    public static void methodA() {
        System.out.println("In methodA()...");
        methodB();
        System.out.println("Exiting methodA()");
    }

    public static void methodB() {
        System.out.println("In methodB()");
        methodC();
        System.out.println("Exiting methodB()");
    }

    public static void methodC() {
        try {               //Error causing code is given inside a handler code - which is try block of try-catch
            System.out.println("In methodC()");
            int q = 20/0;
            System.out.println("result : "+q);
            System.out.println("Exiting methodC()");
        }
        catch (ArithmeticException ex) {    //catch block catches the code, especially for avoiding premature exiting of code
            System.out.println(ex.getMessage()); //which used to affect normal flow.
        }
    }   //Since this is handled, rest of code is not halted and continues to work from the method just before it, which called the controller method
}
