package milestone2.module7.module7basics1.ArrayListExample;

//  Order Preservation (Insertion Order Matters)
//  When the order of elements must be maintained, use ArrayList
//      (e.g., to-do list, playlist, shopping cart).
//
//  Why ArrayList?
//      Because it maintains insertion order by default

import java.util.ArrayList;

/**
 * Demonstrates ORDER PRESERVATION in ArrayList
 */
public class OrderPreservedExample {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<String>();

        tasks.add("Wake up");
        tasks.add("Study Java smartly");
        tasks.add("Practice coding");
        tasks.add("Sleep.");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Task " + (i + 1) + ": " + tasks.get(i));
        }
    }
}
