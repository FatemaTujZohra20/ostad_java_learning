package milestone1.module4.module4Assignment;

import java.util.Scanner;

public class SimpleGeometryCalculator {
    // A static variable that all our static methods can see
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        showWelcome();

        // 1. Get inputs
        double length = getValidNumber("Length");
        double width = getValidNumber("Width");

        // 2. Do calculations (using the 1 for Area, 2 for Perimeter logic)
        double area = runCalculation(length, width, 1);
        double perimeter = runCalculation(length, width, 2);

        // 3. Show results
        showResults(length, width, area, perimeter);

        input.close();
    }

    // Method to stop both negative numbers AND zero
    static double getValidNumber(String label) {
        double value = 0;

        // Now we loop if the value is 0 OR negative
        while (value <= 0) {
            System.out.print("Enter " + label + " (must be greater than 0): ");
            value = input.nextDouble();

            if (value <= 0) {
                System.out.println("Error: " + label + " must be a positive number greater than zero!");
            }
        }
        return value;
    }

    // Single method to calculate Area (choice 1) or Perimeter (choice 2)
    static double runCalculation(double l, double w, int choice) {
        if (choice == 1) {
            return l * w; // Formula: Area = L * W
        } else {
            return 2 * (l + w); // Formula: Perimeter = 2 * (L + W)
        }
    }

    // Method to print everything out
    static void showResults(double l, double w, double a, double p) {
        System.out.println("\n--- Results ---");
        System.out.println("Rectangle: " + l + " by " + w);
        System.out.println("Area: " + a);
        System.out.println("Perimeter: " + p);
        System.out.println("---------------\n");
    }

    static void showWelcome() {
        System.out.println("Welcome to the Simple Geometry Calculator!");
    }
}
