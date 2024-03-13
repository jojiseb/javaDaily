package CheckedException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileCheck {
   /* public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter("abc.txt");

        printWriter.println("Hello World");
    }
    If we try to execute by ignoring the check, We will get unreported exception java.io.FileNotFoundException;

     Which must be caught or declared to be thrown

     Its saying that there is a possibility of exception, and you need to handle it

    So, We must handle it either by using throws or try-catch */

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("abc.txt");

        printWriter.println("Hello"); //trying to print to a file
    }
}
