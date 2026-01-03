package milestone1.module1.module1Assignment;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking the user's name as input (full name)
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("My name is: " + name + ".\n");

        // message1 starts here
        // A fixed message on why I am learning Java
        System.out.println("I am learning Java because: ");

        // Printing a line of 30 hyphens for clear code readability
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
        }
        System.out.println();

        // message 1
        String message1 = """
                I am learning Java because it is one of the most foundational and mature languages in the software 
                industry. It powers large-scale, high-performance systems across finance, telecom, and enterprise 
                applications. The JVM ecosystem gives me the ability to write clean, scalable, and portable code, 
                and the strong typing and object-oriented structure help me build reliable applications.
                
                Additionally, Java’s deep integration with frameworks like Spring Boot makes it ideal for 
                microservices and modern backend development — which is exactly the direction I want to grow my career.
                For me, mastering Java is not just learning a language, it’s learning a full ecosystem used by 
                real companies at production scale.
                """;
        System.out.println(message1);
        // message1 ends here


        // message2 starts here
        // A fixed message about my career goal
        System.out.println("My career goal is following: ");

        // Printing a line of 40 hyphens for clear code readability
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();

        // message 2
        String message2 = """
                My career goal is to become a skilled backend engineer specializing in Java and the Spring ecosystem.
                I am focusing on mastering Java because it gives me the strong object-oriented foundations, scalability,
                and performance needed in modern enterprise applications. 
                I want to build and maintain robust, secure backend systems, apply clean architecture principles, 
                and contribute to real-world microservices solutions.
                I am committed to continuous learning, improving my engineering skills, and applying Java 
                best practices in professional environments.”
                """;
        System.out.println(message2);
        // message2 ends here
    }
}
