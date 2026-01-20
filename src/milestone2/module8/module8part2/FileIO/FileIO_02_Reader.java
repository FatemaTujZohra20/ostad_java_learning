package milestone2.module8.module8part2.FileIO;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileIO_02_Reader {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("out.txt")) {
            int data;
            while ((data = reader.read()) != -1){
                System.out.println((char) data);
            }
            System.out.println("Read completed...");
            reader.close();
        } catch (IOException e) {
            System.out.println("IOException occurred...");
        }
    }
}
