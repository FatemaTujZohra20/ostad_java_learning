package milestone2.module7.module7basics1.ArrayListExample;

//  When data is read frequently but rarely modified, we can use ArrayList
//      (e.g., country list, configuration values).
// Why ArrayList?
//      Best performance for read-heavy scenarios


import java.util.ArrayList;

/**
 * Demonstrates READ-HEAVY usage of ArrayList
 */
public class ReadHeavyExample {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();

        countries.add("Bangladesh");
        countries.add("China");
        countries.add("India");
        countries.add("Japan");

        // All reads are O(1)
        System.out.println(countries.get(0));
        System.out.println(countries.get(1));
        System.out.println(countries.get(2));
        System.out.println(countries.get(3));
    }
}
