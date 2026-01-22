package milestone2.module8.module8part2.SerializationDeserialization;

import java.io.*;

/**
 * The Voter class represents the data model we want to save.
 * It MUST implement Serializable, otherwise, a NotSerializableException will be thrown.
 */
class Voter2 implements Serializable {
    // It is good practice to define a serialVersionUID for version control
    private static final long serialVersionUID = 1L;

    String name;
    String nid;

    // Constructor to initialize Voter objects
    public Voter2 (String name, String nid) {
        this.name = name;
        this.nid = nid;
    }

    /**
     * Overriding toString() allows us to print the object's data
     * in a readable format instead of its memory address.
     */
    @Override
    public String toString() {
        return "Voter2{" +
                "name='" + name + '\'' +
                ", nid='" + nid + '\'' +
                '}';
    }
}


public class Better_Serialization_Deserialization {
    public static void main(String[] args) {
        // 1. Create instances of the Voter class
        Voter2 saifulVoter = new Voter2("Saiful", "123456");
        // rakibVoter is created but not used in the current serialization logic below
        Voter2 rakibVoter = new Voter2 ("Rakib", "123457");

        String filename = "person.ser"; // Note: Usually .ser is used for Java Serialization, not .json

        // --- STEP 1: SERIALIZATION (Writing Object to File) ---
        // We use FileOutputStream to create the file and ObjectOutputStream to write the object.
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {

            out.writeObject(saifulVoter); // Converts the object to a byte stream
            System.out.println("Success: Object has been serialized to " + filename);

        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }

        // --- STEP 2: DESERIALIZATION (Reading Object from File) ---
        // We use FileInputStream to read the file and ObjectInputStream to reconstruct the object.
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {

            // readObject() returns a generic Object, so we must cast it back to 'Voter'
            Voter2 deserializedPerson = (Voter2) in.readObject();

            System.out.println("Success: Object has been deserialized.");
            System.out.println("Data retrieved: " + deserializedPerson);

        } catch (IOException | ClassNotFoundException e) {
            // ClassNotFoundException occurs if the Voter class isn't found in the project
            e.printStackTrace();
        }


        // OUTPUT:
        // ----------
        //Success: Object has been serialized to person.ser
        //Success: Object has been deserialized.
        //Data retrieved: Voter{name='Saiful', nid='123456'}
    }
}