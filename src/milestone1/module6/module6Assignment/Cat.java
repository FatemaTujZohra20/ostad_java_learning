package milestone1.module6.module6Assignment;

public class Cat extends Pet implements PetBehavior {
    public Cat(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the cat");
    }

    @Override
    public void play() {
        System.out.println("Playing with the cat");
    }

    @Override
    public String toString() {
        return "Cat [Name: " + getName() + ", Age: " + getAge() + ", Breed: " + getBreed() + "]";
    }
}
