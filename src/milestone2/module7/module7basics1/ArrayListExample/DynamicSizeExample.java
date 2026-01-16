package milestone2.module7.module7basics1.ArrayListExample;

// Dynamic Size (Unknown Data Count)
// When we use ArrayList ->
// When the number of elements is not known beforehand
// (e.g., logs, API responses, user input).
// Dynamic size: It automatically grows when elements are added

import java.util.ArrayList;

/**
 * Demonstrates DYNAMIC SIZE of ArrayList
 *
 * Real-world analogy:
 * Like a bag that expands as you add items.
 */
public class DynamicSizeExample {
    public static void main(String[] args) {
        ArrayList<String> logs = new ArrayList<>();

        logs.add("Server started");
        logs.add("User logged in");
        logs.add("Request processed");
        logs.add("Server stopped");

        System.out.println("Total logs: " + logs.size());

        // O(n) traversal
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
