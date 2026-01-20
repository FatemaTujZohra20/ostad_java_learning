package milestone2.module8.module8part2.FileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileIO_01 {
    public static void main(String[] args) {
//       try (Writer writer = new FileWriter("out.txt"))
//       /work/dev/Java_IJ/ostad_java_learning/src/milestone2/module8/module8part2/FileIO
        try (Writer writer = new FileWriter("out.txt")) {
           for (int i = 1; i <= 10; i++) {
               writer.write(String.valueOf(i));
           }
           System.out.println("Writing completed...");
           writer.close();
       } catch (IOException e) {
           System.out.println("IOException occurred...");
       }
    }
}
