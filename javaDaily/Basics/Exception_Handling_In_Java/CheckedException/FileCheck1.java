package CheckedException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCheck1 {
    public static void main(String[] args) {
        try {
            File file = new File("c://file.txt");

            //Creating bf Object to buffer the data
            BufferedReader bf = new BufferedReader(new FileReader(file));

            String content;

            while ((content = bf.readLine()) != null) {
                System.out.println(content);
            }

            bf.close();
        }
        catch (IOException ex) {    //It's mandatory to deal with IOException during File Operations
            ex.printStackTrace();
        }

        System.out.println("Statement after exception..");
    }
}
