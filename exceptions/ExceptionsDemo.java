package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            System.out.println("File Opened");
            var value = reader.read();
        } catch (IOException ex) {
            System.out.println("File could not be Found");
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException ex) {
                    ex.getMessage();
                }
        }
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
