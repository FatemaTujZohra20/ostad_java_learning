package milestone1.module5.module5Assignment;

import java.util.Scanner;

public class CartManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize available inventory
        CartItem egg = new CartItem("Egg", 10.0);
        CartItem milk = new CartItem("Milk", 20.0);
        CartItem noodles = new CartItem("Noodles", 30.0);

        // State management variables
        CartItem selectedItem = null;  // Tracks which item the user is currently editing
        boolean running = true;

        System.out.println("--- Welcome to E-Commerce Manager ---");

        while (running) {
            displayMenu();

            // Visual feedback: Show the user which item they are currently modifying
            if (selectedItem != null && selectedItem.isAddedToCart()) {
                System.out.println(">> CURRENTLY FOCUSING ON: " + selectedItem.getName());
            } else {
                selectedItem = null; // Reset focus if item was removed
            }


            System.out.println("Enter choice: ");
            int choice = input.nextInt();
            input.nextLine();   // Consume newline leftover

            switch (choice) {
                case 1: case 2: case 3:
                    // Set focus based on selection and enter toggle logic
                    selectedItem = (choice == 1) ? egg : (choice == 2) ? milk : noodles;
                    toggleCartStatus(selectedItem, input);
                    break;
                case 4:
                    printCart(egg, milk, noodles);
                    break;
                case 5:
                    // Increment quantity for the focused item
                    if (selectedItem != null && isSafe(selectedItem)) {
                        selectedItem.incrementQuantity();
                        System.out.println("Updated " + selectedItem.getName() + " (ID: " + selectedItem.getProductId()
                                + ") to quantity " + selectedItem.getQuantity());
                    } else if (selectedItem == null) {
                        System.out.println("Select an item first!");
                    }
                    break;
                case 6:
                    // Decrement quantity for the focused item
                    if (selectedItem != null && isSafe(selectedItem)) {
                        selectedItem.decrementQuantity();

                        if (selectedItem.isAddedToCart()){
                            System.out.println("Reduced " + selectedItem.getName() + " to " +
                                    selectedItem.getQuantity());
                        } else {
                            System.out.println(selectedItem.getName() + " reached 0 and was removed from your cart.");
                        }
                    } else if (selectedItem == null) {
                        System.out.println("Error: No item selected! Press 1, 2, or 3 first.");
                    }
                    break;
                case 0:
                    running = false;
                    System.out.println("Thank you for shopping!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        input.close();
    }


    /**
     * Helper to display the main interface options.
     */
    private static void displayMenu() {
        System.out.println("\n--- MAIN MENU ---");
        System.out.println("1. Select Egg");
        System.out.println("2. Select Milk");
        System.out.println("3. Select Noodles");
        System.out.println("4. View Cart & Total");
        System.out.println("5. Increment Quantity (+)");
        System.out.println("6. Decrement Quantity (-)");
        System.out.println("0. Exit");
    }


    /**
     * Handles adding an item to the cart or confirming removal if already present.
     */
    private static void toggleCartStatus(CartItem item, Scanner input) {
        if (!item.isAddedToCart()) {
            // If it's NOT in the cart, add it as a new item
            item.setAddedToCart(true);
            item.setQuantity(1);
            System.out.println("+++ " + item.getName() + " added to cart. +++");
        } else {
            // If it IS in the cart, don't just delete it!
            // Ask the user if they want to remove it or just focus on it.
            System.out.println(">> " + item.getName() + " is already in the cart (Quantity: " + item.getQuantity() + ")");
            System.out.print("Do you want to REMOVE this item entirely? (Y/N): ");

            String choice = input.next().toLowerCase();
            if (choice.equals("y")) {
                item.setAddedToCart(false);
                item.setQuantity(0);
                System.out.println("--- " + item.getName() + " removed from cart. ---");
            } else {
                // I am doing it so that I can go back to the item without losing the quantity
                System.out.println("Focusing on " + item.getName() + ". You can now use 5 or 6 to adjust quantity.");
            }
        }
    }


    /**
     * Validates if an item is eligible for quantity adjustment.
     */
    private static boolean isSafe(CartItem item) {
        if (!item.isAddedToCart()) {
            System.out.println("Error: " + item.getName() + " is not in your cart yet!");
            return false;
        }
        return true;
    }


    /**
     * Displays a formatted table of all items currently in the cart and the grand total.
     */
    private static void printCart(CartItem... items) {
        double grandTotal = 0;
        System.out.println("\n--- YOUR SHOPPING CART ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "ID", "Item", "Price", "Quantity", "Sub Total");

        for (CartItem item : items) {
            if (item.isAddedToCart()){
                System.out.printf("%-10d %-10s %-10.2f %-10d %-10.2f\n", item.getProductId(),
                        item.getName(), item.getUnitPrice(), item.getQuantity(), item.getItemTotal());
                grandTotal += item.getItemTotal();
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Total Payable Amount: $" + grandTotal);
    }
}
