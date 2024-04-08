import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx2 {
    public static void main(String[] args) {
        try {
            findFile();
            System.out.println("File obtained..");
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    //Code won't get executed, if it's not declared/handled in method signature

    //If it's declared, then it's the responsibility of caller to handle it
    static void findFile() throws FileNotFoundException {
        File fileName = new File("test.txt");
        FileInputStream inputStream = new FileInputStream(fileName);
    }
}
