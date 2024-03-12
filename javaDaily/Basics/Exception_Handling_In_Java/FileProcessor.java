import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileProcessor {    //Checked exception -- Compile time issue. Letting the user handle the error.
                                //Compile-time error
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E://fileName.txt");

        FileReader fileReader = new FileReader(file);
    }
}
