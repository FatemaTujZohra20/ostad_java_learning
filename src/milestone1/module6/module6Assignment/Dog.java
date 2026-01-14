package milestone1.module6.module6Assignment;

public class Dog extends Pet implements PetBehavior {

    public Dog(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the dog");
    }

    @Override
    public void play() {
        System.out.println("Playing with the dog");
    }

    @Override
    public String toString() {
        return "Dog [Name: " + getName() + ", Age: " + getAge() + ", Breed: " + getBreed() + "]";
    }
}
