package milestone1.module6.module6Assignment;

/**
 * PetAdoptionSystem: The entry point for the PAS application.
 * This class demonstrates object creation, method overriding,
 * and interaction between owners and their pets.
 */
public class PetAdoptionSystem {
    public static void main(String[] args) {

        // --- 1. OBJECT INSTANTIATION ---
        // Creating specific instances of the Dog and Cat classes
        Dog myDog = new Dog("Cleo", 2, "Labrador Retriever");
        Cat myCat = new Cat("Pixel", 3, "British Shorthair");

        // Creating the Owner
        // Note: Make sure the parameters match (Name first, then Address)
        Owner owner = new Owner("New Germany", "John Doe");

        // --- 2. THE ADOPTION PROCESS ---
        System.out.println("=== Starting Adoption Process ===");
        owner.adoptPet(myDog);
        owner.adoptPet(myCat);
        System.out.println();  // Prints a blank line for readability

        // --- 3. DOG INTERACTION & POLYMORPHISM ---
        // Demonstrating Dog-specific behaviors
        System.out.println(">>> Inspecting Dog Details:");
        System.out.println(myDog);   // Automatically calls Dog.toString()
        myDog.makeSound();
        myDog.feed();
        myDog.play();
        System.out.println();

        // --- 4. CAT INTERACTION & POLYMORPHISM ---
        // Demonstrating Cat-specific behaviors
        System.out.println(">>> Inspecting Cat Details:");
        System.out.println(myCat);  // Automatically calls Cat.toString()
        myCat.makeSound();
        myCat.feed();
        myCat.play();

        // --- 5. FINAL REPORT ---
        // Displaying a clean summary of the Owner's status
        System.out.println("----------------------------------");
        System.out.println("        ADOPTION SUMMARY         ");
        System.out.println("----------------------------------");
        System.out.println("Owner Name: " + owner.getName());
        System.out.println("Address: " + owner.getAddress());
        System.out.println("Total adopted: " + owner.getPetsAdopted() + "pet(s)");
        System.out.println("----------------------------------");
    }
}
