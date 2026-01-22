package milestone2.module8.module8part2.SerializationDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * The Voter class represents a data entity.
 * It implements Serializable to indicate to the JVM that objects of this
 * class can be converted into a byte stream.
 */
class Voter implements Serializable {
    // Fields to be serialized
    String name;
    String nid;

    // Constructor for creating Voter objects
    public Voter (String name, String nid) {
        this.name = name;
        this.nid = nid;
    }

    /**
     * Overrides the default toString method.
     * This provides a human-readable representation of the object's data
     * when it is printed after deserialization.
     */
    @Override
    public String toString() {
        return "Voter{" +
                "name='" + name + '\'' +
                ", nid='" + nid + '\'' +
                '}';
    }
}

/**
 * Main class to execute the Serialization and Deserialization logic.
 */
public class Serialization_Deserialization {
    public static void main(String[] args) throws FileNotFoundException {
        // Initialize sample objects
        Voter saifulVoter = new Voter("Saiful", "123456");
        Voter rakibVoter = new Voter ("Rakib", "123457");


        // --- PART 1: SERIALIZATION ---
        /**
         * Try-with-resources block for ObjectOutputStream.
         * FileOutputStream: Creates/opens the file "person.json".
         * ObjectOutputStream: Writes the Java object's state to the stream.
         */
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.json"))) {
            // Converts the 'saifulVoter' object to bytes and saves it to the file
            out.writeObject(saifulVoter);
            System.out.println("Object has been serialized.");
        } catch (IOException e) {
            // Handles potential errors like file access issues
            e.printStackTrace();
        }


        // --- PART 2: DESERIALIZATION ---
        /**
         * Try-with-resources block for ObjectInputStream.
         * FileInputStream: Reads the binary data from "person.json".
         * ObjectInputStream: Reconstructs the object from the stream.
         */
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.json"))) {
            // readObject() returns an Object type, so we explicitly cast it to 'Voter'
            Voter deserializedPerson = (Voter) in.readObject();
            // Print the reconstructed object to verify the data is intact
            System.out.println("Deserialized Object: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            /**
             * IOException: Issues reading the file.
             * ClassNotFoundException: The JVM cannot find the 'Voter' class definition.
             */
            e.printStackTrace();
        }

    }
}
