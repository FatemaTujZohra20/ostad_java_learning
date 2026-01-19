package milestone2.module8.module8exception;

import java.util.Scanner;

public class ExceptionThrowNewBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        try {
            if (age < 18 || age > 56) {
                throw new IllegalArgumentException("Invalid Age");
//                throw new Exception("Invalid age!");
//
            } else {
                System.out.println("congratulations!");
            }
            scanner.close();
        } catch (IllegalArgumentException e) {
            System.out.println("Something went wrong : Invalid Age");
            throw e;
        } finally {
            System.out.println("Goodbye!");
        }

    }
}
