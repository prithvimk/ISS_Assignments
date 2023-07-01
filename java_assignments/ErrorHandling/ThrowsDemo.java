package ErrorHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {

    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }

    public static void readFile(String filename) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filename);
    }
}

