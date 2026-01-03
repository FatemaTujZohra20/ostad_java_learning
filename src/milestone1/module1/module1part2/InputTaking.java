package milestone1.module1.module1part2;

import java.util.Scanner;

public class InputTaking {
    public static void main(String[] args) {
        // This is how we take an input in Java
        System.out.println("Enter the name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello and welcome! " + name + ".");
    }
}
