package milestone1.module1.module1part1;

// A simple idea on Java package
// The way of importing package's entities is following:-
import milestone1.module1.module1part1.service.Student;

public class Main {
    public static void main(String[] args) {
        // The following is after getting the name and getStudent() method by importing
        // Student class's info from Service package
        System.out.println("Hello and welcome: " + Student.name);
        System.out.println("Method from package's entity (Student): " + Student.getStudent("Zohra"));
    }
}
