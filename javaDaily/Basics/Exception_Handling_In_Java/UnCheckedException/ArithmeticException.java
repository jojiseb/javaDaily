package UnCheckedException;

public class ArithmeticException {  //No compile-time error, but at run-time error
    public static void main(String[] args) {
        System.out.println(10/0);  //Throws Arithmetic Exception caused by / by 0.
    }                            // This is an exception, but was not checked by
}                               // compiler, like FileNOtFoundException etc.
                            // So, It's an Un-Checked Exception . And programmer needs to handle it