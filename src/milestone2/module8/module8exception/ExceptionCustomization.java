package milestone2.module8.module8exception;

import java.util.ArrayList;
import java.util.List;

class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException() {
        super("Student not found!!");
    }
}


public class ExceptionCustomization {
    public static void main(String[] args) {
        List<String> students = List.of("Student1", "Zohra", "Jannat");

        try {
            if (students.contains("Zolly")) {
                System.out.println("Student found!");
            } else {
                throw new StudentNotFoundException();
            }
        } catch (StudentNotFoundException | IllegalArgumentException e) {    // multi-catch block
            System.out.println(e);  // milestone2.module8.module8exception.StudentNotFoundException: Student not found!!
        }
    }
}
