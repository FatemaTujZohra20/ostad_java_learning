package milestone2.module7.module7basics1.ArrayListExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents chat message history
 * Order matters, duplicates allowed
 */
public class ChatHistory {
    public static void main(String[] args) {

        // ArrayList is chosen for fast index access and append
        List<String> messages = new ArrayList<>();

        messages.add("Hello");
        messages.add("How are you doing?");
        messages.add("Hello");  // duplicates allowed

        // Access by index
        System.out.println(messages.get(0));    // O(1) = Order of 1

        // Iterate in insertion order
        for (String msg : messages) {
            System.out.println(msg);
        }
    }
}
