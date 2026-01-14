package milestone1.module4.module4Assignment;

import java.util.Scanner;

public class SimpleGeometryCalculator {
    // A static variable that all our static methods can see
    static Scanner input = new Scanner(System.in);

    /**
     * Main entry point of the application.
     * Orchestrates the flow of the program from input to output.
     */
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


    /**
     * Prompts the user for a numeric input and validates that it is positive.
     * * @param label The name of the dimension being requested (e.g., "Length").
     * @return A double value strictly greater than zero.
     */
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


    /**
     * Performs geometric calculations based on a provided operation code.
     * * @param l The length of the rectangle.
     * @param w The width of the rectangle.
     * @param choice The calculation type: 1 for Area, 2 for Perimeter.
     * @return The result of the selected geometric calculation.
     */
    static double runCalculation(double l, double w, int choice) {
        if (choice == 1) {
            return l * w; // Formula: Area = L * W
        } else {
            return 2 * (l + w); // Formula: Perimeter = 2 * (L + W)
        }
    }

    /**
     * Displays the final dimensions and calculated results in a formatted block.
     * * @param l Length
     * @param w Width
     * @param a Calculated Area
     * @param p Calculated Perimeter
     */
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
