package milestone2.module7.module7basics1.ArrayListExample;

// Sorting & Data Processing
//      When data needs to be sorted or processed, we use ArrayList
//      (e.g., exam scores, product prices).
// Why ArrayList?
//      Efficient random access improves sorting performance
//      Works smoothly with Collections.sort()

import java.util.ArrayList;
import java.util.Collections;

/**
 * Demonstrates SORTING using ArrayList
 */
public class SortingExample {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(79);
        scores.add(90);
        scores.add(80);
        scores.add(88);
        scores.add(65);

        // O(n log n)
        Collections.sort(scores);

        for (int score : scores) {
            System.out.println(score);
        }
    }
}
