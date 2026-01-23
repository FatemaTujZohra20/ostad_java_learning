package milestone2.module8.module8exception;

/**
 * Title: Custom Exception Implementation in Java
 * Description: This program demonstrates how to define a user-defined exception
 * class by extending the base 'Exception' class and how to trigger it manually.
 */

// Step 1: Define the Custom Exception Class
// By extending 'Exception', MyException becomes a "Checked Exception"
class MyException extends Exception {
    // Constructor that accepts a custom error message
    public MyException(String message) {
        /* The 'super' keyword passes the message to the parent Exception class,
           allowing it to be retrieved later using e.getMessage() or e.toString(). */
        super(message);
    }
}

public class CustomException {

    public static void main(String[] args) {
        int c = 22;
        int d = 0;

        try{
            // Step 2: Division logic
            // 18 / 22 results in 0 due to integer division truncation.
            d = 18/c;

            // Step 3: Trigger the Custom Exception
            if (d == 0)
                /* We instantiate and throw our own specific Exception class.
                   This makes the logs much easier to filter than generic errors. */
                throw new MyException("I don't want to print this");
        } catch (MyException e) {   // Step 4: Catch the Custom Exception specifically
            /* This block only executes if 'MyException' is thrown.
               We recalculate or provide a fallback value here. */
            d = 18/1;   // Correcting d to 18 as a fallback
            System.out.println("That is the default output " + e);
        } catch (Exception e) {     // Step 5: Catch any other unexpected Runtime errors
            System.out.println("Something went wrong!" + e);
        }

        // Step 6: Finalize program flow
        System.out.println("d = " + d);
        System.out.println("Bye");
    }
}
