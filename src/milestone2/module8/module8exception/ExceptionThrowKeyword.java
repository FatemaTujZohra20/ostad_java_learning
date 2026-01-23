package milestone2.module8.module8exception;

/**
 * Title: Custom Exception Handling using 'throw'
 * Description: This program demonstrates how to manually trigger an exception
 * using the 'throw' keyword to redirect program flow to a catch block,
 * even if a standard JVM error hasn't occurred.
 */
public class ExceptionThrowKeyword {
    public static void main(String[] args) {
        // Step 1: Initialize variables
        int a = 20;
        int b = 0;

        try {
            // Step 2: Perform division
            // Since 18/20 in integer math is 0.9, Java truncates it to 0.
            b = 18/a;

            // Step 3: Conditional Check
            // We want to avoid 'b' being 0, so we "force" an error state.
            if(b == 0){
                /* The 'throw' keyword manually creates an exception object.
                   Execution stops here and jumps immediately to the catch block. */
                throw new ArithmeticException("I don't want to print this.");
            }

            // This line will NEVER run if b is 0
            System.out.println("This won't be seen if exception is thrown.");

        } catch (ArithmeticException e) {   // Step 4: Specific Exception Handling
            /* This block catches the manually thrown ArithmeticException.
               We use it here to provide a 'default' or 'fallback' value. */
            b = 18/1;
            System.out.println("that is the default output " + e);
        } catch (Exception e) {     // Step 5: General Exception Handling
            /* This acts as a safety net for any other unexpected errors. */
            System.out.println("Something went wrong!" + e);
        }

        // Step 6: Resume normal execution
        // Because the exception was caught, the program continues instead of crashing.
        System.out.println("b = " + b);
        System.out.println("Bye");
    }
}
