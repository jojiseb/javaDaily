import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFoundEx1 { //Checked Exceptions - IOException and FileNoFoundException
    public static void main(String[] args) throws IOException { //Both FileNotFoundException and IOException is thrown by IOException itself
        FileInputStream fileInputStream = null;                 //since, FileNotFoundException is a subclass of IOException
        //Opening a file
        fileInputStream = new FileInputStream("C://file.txt");  //FileNotFoundException is reported -- when tried to read from a file which doesn't exist
        int content = 0;

        while((content = fileInputStream.read()) != -1) {  //IOException is reported - occurs when working on input/output operations --> here, it's reading from a file
            System.out.println(content);                 //tried to read from a file which doesn't exist
        }
        //close the file
        fileInputStream.close();
    }
}           //We get a meaningful error message when execute the code
