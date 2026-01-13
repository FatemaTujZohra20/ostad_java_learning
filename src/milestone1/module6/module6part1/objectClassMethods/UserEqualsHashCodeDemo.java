package milestone1.module6.module6part1.objectClassMethods;

import java.util.Objects;


/**
 * ============================================================
 * User class
 * ============================================================
 *
 * This class demonstrates how to properly override:
 *   1. equals()  → Logical equality (data comparison)
 *   2. hashCode() → Required when equals() is overridden
 *
 * Why this matters:
 * - Java collections (HashSet, HashMap) rely on hashCode + equals
 * - Object.equals() by default compares memory addresses
 * - We want to compare USER DATA, not memory location
 */
class User2 {
    int id;     // Unique identifier for the user
    String name;    // Name of the user

    /**
     * Parameterized constructor
     *
     * @param id   unique user id
     * @param name user name
     */
    User2(int id, String name) {
        this.id = id;
        this.name = name;
    }


    /**
     * ============================================================
     * Overriding equals()
     * ============================================================
     *
     * Purpose:
     * - Define when two User objects should be considered "equal"
     *
     * Contract:
     * - If two objects are equal using equals(),
     *   they MUST return the same hashCode()
     */
    @Override
    public boolean equals(Object obj) {

        // Check if both references point to the SAME object
        if (this == obj) {
            return true;
        }

        // Check for null and ensure both objects are of SAME class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Safe type casting after class check
        User2 user2 = (User2) obj;

        // Compare actual fields (logical equality)
        return id == user2.id &&
                Objects.equals(name, user2.name);
    }


    /**
     * ============================================================
     * Overriding hashCode()
     * ============================================================
     *
     * Purpose:
     * - Provides a numeric representation of object state
     * - Used internally by hash-based collections
     *
     * Rule:
     * - If equals() returns TRUE → hashCode() MUST be same
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}


/**
 * ============================================================
 * Main class to test equals() and hashCode()
 * ============================================================
 */
public class UserEqualsHashCodeDemo {
    public static void main(String[] args) {

        // Creating two DIFFERENT objects with SAME data
        User2 u1 = new User2(1, "John");
        User2 u2 = new User2(1, "John");

        /**
         * Memory View:
         *
         * u1 → Object A (id=1, name=Fatema)
         * u2 → Object B (id=1, name=Fatema)
         *
         * Different memory locations
         */

        // Reference comparison (NOT overridden)
        System.out.println(u1 == u2);
        // false → because u1 and u2 are different objects in memory

        // Logical comparison (overridden equals)
        System.out.println(u1.equals(u2));
        // true → because id and name values are equal

        // HashCode comparison
        System.out.println(u1.hashCode());   // 2315531
        System.out.println(u2.hashCode());   // 2315531
        // Same hash code → REQUIRED by equals() contract
    }
}



