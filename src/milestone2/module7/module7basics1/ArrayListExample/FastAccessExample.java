package milestone2.module7.module7basics1.ArrayListExample;

import java.util.ArrayList;
import java.util.List;

// Fast Access (Index-Based Read)
// We use ArrayLIst ->
// When we need very fast access to elements using an index
// (e.g., Student list, cached data, menu items)

/**
 * Demonstrates FAST ACCESS using ArrayList
 *
 * Real-world analogy:
 * Like a bookshelf where each book has a fixed number.
 */
public class FastAccessExample {
    public static void main(String[] args) {
        List<String> students = new ArrayList<String>();
        students.add("Alina");
        students.add("Bob");
        students.add("Daniel");
        students.add("Danny");

        // O(1) time complexity
        System.out.println("Student at index 2: " + students.get(2));

    }
}
