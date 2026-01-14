package milestone1.module6.module6part2.Interface;

// Main Code
public class InterfaceDemo {
    public static void main(String[] args) {
        // We create specific objects but can treat them as "Animals"
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
    }
}
