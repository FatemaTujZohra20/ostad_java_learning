package milestone2.module8.module8part2.FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"))) {
            for (int i = 1; i <= 100; i++) {
                bufferedWriter.write(String.valueOf(i) + "\n");
            }
            System.out.println("Writing completed.. ");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("IOException occurred.");
        }
    }
}
