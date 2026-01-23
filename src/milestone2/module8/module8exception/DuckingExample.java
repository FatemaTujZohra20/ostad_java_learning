package milestone2.module8.module8exception;

/**
 * Title: Exception Ducking using 'throws'
 * Description: This program demonstrates how a method can "duck" (delegate)
 * an exception to its caller instead of handling it locally.
 */

class Calculation {
    // We use 'throws' to say: "I might fail, but I'm not fixing it here."
    // This is the 'ducking' part.
    public void divide() throws ArithmeticException, InterruptedException {
        int a = 10;
        int b = 0;

        System.out.println("Wait for 1 second before dividing...");
        Thread.sleep(1000); // This checked exception MUST be ducked or caught

        int result = a / b; // This will trigger ArithmeticException
        System.out.println("Result: " + result);
    }
}
public class DuckingExample {
    // Main also has the option to duck (throws Exception),
    // but usually, it's best to catch it here.
    public static void main(String[] args) {
        Calculation obj = new Calculation();

        try {
            // Because divide() ducks exceptions, the caller is FORCED to handle them
            obj.divide();
        }
        catch (ArithmeticException e) {
            System.out.println("Handled in Main: Cannot divide by zero.");
        }
        catch (InterruptedException e) {
            System.out.println("Handled in Main: The sleep was interrupted.");
        }

        System.out.println("Program continues...");
    }
}
