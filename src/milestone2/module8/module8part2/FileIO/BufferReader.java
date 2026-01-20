package milestone2.module8.module8part2.FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"), 4)) {
            String data = null;

            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }

            System.out.println("Reading completed.. ");
        } catch (IOException e) {
            System.out.println("IOException occurred.");
        }

    }
}
