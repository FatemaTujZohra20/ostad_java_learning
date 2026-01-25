package milestone2.module8.module8Assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A File-Based Note-Taking Application.
 * This system allows users to Create, Read, Update, and Delete (CRUD) notes
 * stored as physical .txt files on the local disk.
 */
public class NoteTakingApplication {

    // Storage configuration
    private static final String FOLDER_PATH = "./notes";
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Ensure the directory exists before doing anything else
        initializeStorage();

        // Main Execution Loop
        while (true) {
            System.out.println("\n--- FILE NOTE SYSTEM ---");
            System.out.println("1. Create | 2. View All | 3. Update | 4. Delete | 5. Reset | 6. Exit");
            System.out.print("Select: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1": createNote(); break;
                case "2": viewAllNotes(); break;
                case "3": updateNote(); break;
                case "4": deleteNote(); break;
                case "5": resetNotes(); break;
                case "6": exitApp(); return;    // Terminate program
                default: System.out.println("Invalid choice.");
            }
        }

    }


    /**
     * Checks if the storage folder exists. If not, creates it.
     */
    private static void initializeStorage() {
        File folder = new File(FOLDER_PATH);
        if (!folder.exists()) {
            boolean created = folder.mkdir();
            if (created) {
                System.out.println("Storage folder initialized.");
            }
        }
    }


    /**
     * Helper method to fetch all files from the notes folder.
     * @return Array of Files, or null if folder is empty/missing.
     */
    private static File[] getStoredFiles() {
        File folder = new File(FOLDER_PATH);
        File[] files = folder.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("No notes found.");
            return null;
        }
        return files;
    }


    /**
     * Displays all existing notes and their contents.
     * Uses Java Streams to strip the ".txt" extension for display.
     */
    private static void viewAllNotes() {
        File[] files = getStoredFiles();
        if (files == null) return;

        String[] cleanIds = Arrays.stream(files)
                .map(File::getName)
                .map(s -> s.substring(0, s.length() - 4))
                .toArray(String[]::new);

        System.out.println("\n--- CURRENT NOTES ---");
        for (String id : cleanIds) {
            System.out.println("[" + id + "]");
            displayFileContent(id);
        }
    }


    /**
     * Creates a new note. Validates that the ID is numeric.
     */
    private static void createNote() {
        System.out.print("Enter Unique ID (e.g., 1, 2, 3...): ");
        String id = sc.nextLine();
        File file = new File(FOLDER_PATH + "/note-" + id + ".txt");

        // Regex Validation: ensures input is strictly digits
        if (!id.matches("\\d+")) {
            System.out.println("Error: Invalid ID. Please use numbers only (e.g., 1, 2, 3).");
            return;
        }

        if (file.exists()) {
            System.out.println("Error: ID already exists.");
            return;
        }

        System.out.print("Enter content: ");
        String content = sc.nextLine();

        // Write fresh file (append = false)
        writeFile(file, content, false);
        System.out.println("Note saved successfully.");
    }


    /**
     * Updates an existing note with validation for selection and existence.
     */
    private static void updateNote() {
        viewAllNotes();  // Show user what exists before asking for ID
        System.out.print("Enter the full identifier to update (e.g., note-1): ");
        String id = sc.nextLine();
        File file = new File(FOLDER_PATH + "/" + id + ".txt");

        if (!file.exists()) {
            System.out.println("Note not found.");
            return;
        }

        // Validation Loop for Replace vs Append
        String updateChoice;
        while (true) {
            System.out.print("Choose: [1] Replace [2] Append: ");
            updateChoice = sc.nextLine();
            if (updateChoice.equals("1") || updateChoice.equals("2")) {
                break; // Valid input received, exit the loop
            }
            System.out.println("Invalid selection. Please enter 1 or 2.");
        }

        boolean append = updateChoice.equals("2");
        // --- END OF FIX ---

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        writeFile(file, text, append);
        System.out.println("Note updated.");
    }


    /**
     * Deletes a specific note file based on user input.
     */
    private static void deleteNote() {
        System.out.print("Enter the full identifier to delete (e.g., note-1): ");
        String id = sc.nextLine();
        File file = new File(FOLDER_PATH + "/" + id + ".txt");
        if (file.delete()) System.out.println("Deleted.");
        else System.out.println("Delete failed.");
    }


    /**
     * Deletes all note files in the folder after confirmation.
     */
    private static void resetNotes() {
        File[] files = getStoredFiles();
        if (files == null) return;

        System.out.print("Confirm Reset (y/n): ");
        if (sc.nextLine().equalsIgnoreCase("y")) {
            for (File f : files) {
                if (!f.delete()) {
                    System.out.println("Warning: Could not delete " + f.getName());
                }
            }
            System.out.println("Reset process complete. All notes cleared.");
        }
    }


    /**
     * Utility method to read and print file contents.
     * @param id The filename without extension (e.g., "note-1")
     */
    private static void displayFileContent(String id) {
        File file = new File(FOLDER_PATH + "/" + id + ".txt");
        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                System.out.println("  > " + reader.nextLine());
            }
        } catch (IOException e) {
            System.out.println("  [Error reading content]");
        }
    }


    /**
     * Generic File Writing utility using Try-With-Resources.
     * @param file The File object to write to.
     * @param content The string to write.
     * @param append Whether to add to end (true) or overwrite (false).
     */
    private static void writeFile(File file, String content, boolean append) {
        try (FileWriter writer = new FileWriter(file, append)) {
            if (append) {
                writer.write("\n");   // Move to new line before appending
            }
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }
    }


    /**
     * Safely closes resources and exits.
     */
    private static void exitApp() {
        System.out.println("Goodbye!");
        sc.close();
    }
}
