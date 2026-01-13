package milestone1.module6.module6part1.objectClassMethods;

/**
 * User class represents a real-world entity: a system user.
 *
 * In Java, every class implicitly extends the Object class.
 * That means User automatically inherits methods like:
 *  - toString()
 *  - equals()
 *  - hashCode()
 *  - getClass()
 *
 * Here we override toString() to provide
 * a meaningful, human-readable representation of a User object.
 */
class User {

    /**
     * Unique identifier for the user.
     * Example: database primary key
     */
    int id;

    /**
     * Name of the user.
     */
    String name;


    /**
     * Constructor initializes the User object.
     *
     * @param id   unique user id
     * @param name username
     *
     * The 'this' keyword refers to the current object.
     * It differentiates instance variables from constructor parameters.
     */
    User(int id, String name) {
        this.id = id;
        this.name = name;
    }


    /**
     * Overrides Object's toString() method.
     *
     * PURPOSE:
     * When an object is printed, logged, or concatenated with a String,
     * Java automatically calls toString().
     *
     * DEFAULT BEHAVIOR (if not overridden):
     *   User@7b23ec81
     *   → className@memoryHash
     *
     * CUSTOM BEHAVIOR (after override):
     *   User{id=1, name='Fatema'}
     *
     * @return human-readable description of User object
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + "'" +
                '}';
    }
}


/**
 * Entry point class demonstrating Object class behavior.
 *
 * This class shows how Java internally calls toString()
 * when an object is printed using System.out.println().
 */
public class ObjectClassMethods01 {
    /**
     * Main method — JVM execution starts here.
     *
     * @param args command-line arguments (not used here)
     */
    public static void main(String[] args) {
        /**
         * Creating a User object.
         *
         * Internally:
         * 1. Memory is allocated on the heap
         * 2. Constructor initializes fields
         * 3. Reference 'user' points to the object
         */
        User user = new User(1, "Fatema");

        /**
         * System.out.println(user)
         *
         * What REALLY happens:
         *  - println() calls user.toString()
         *  - Returned String is printed to console
         *
         * Without overriding toString():
         *   User@7b23ec81
         *
         * With overridden toString():
         *   User{id=1, name='Fatema'}
         */
//        System.out.println(user);  // User@7b23ec81  --> Without override toString()
        System.out.println(user);  // User{id=1, name='Fatema'}   --- Human readable form
    }
}
