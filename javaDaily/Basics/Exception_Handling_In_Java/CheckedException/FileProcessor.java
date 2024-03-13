package CheckedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileProcessor {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D://Name.txt"); //This occurred at run-time, since path is not valid

        FileReader fileReader = new FileReader(file);
    }
}
