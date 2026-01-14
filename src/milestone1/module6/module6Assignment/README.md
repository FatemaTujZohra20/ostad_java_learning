# 🐾 Pet Adoption System (PAS)

A modular Java application demonstrating core Object-Oriented Programming (OOP) principles through a pet management and adoption simulation.

## 🏗️ Project Architecture

The system is built using a hierarchical structure where specific animal types inherit from a base class and implement a behavioral interface.



## 🛠️ Core OOP Concepts Applied

This project was designed to showcase four fundamental pillars of Object-Oriented Programming:

### 1. Inheritance (`extends`)
* **Implementation:** The `Dog` and `Cat` classes extend the `Pet` base class.
* **Benefit:** This allows the subclasses to inherit common attributes like `name`, `age`, and `breed` without code duplication, promoting a "DRY" (Don't Repeat Yourself) architecture.

### 2. Abstraction (`interface`)
* **Implementation:** The `PetBehavior` interface defines the `feed()` and `play()` methods.
* **Benefit:** It establishes a strict "contract." Any new pet added to the system (like a Bird or Rabbit) is forced to implement these essential behaviors, ensuring consistency across the application.



### 3. Polymorphism (Method Overriding)
* **Implementation:** Both `Dog` and `Cat` override the `makeSound()` method from the `Pet` class.
* **Benefit:** This allows the `PetAdoptionSystem` to call the same method name on different objects while producing unique results (e.g., "Woof!" vs "Meow!").

### 4. Encapsulation (Access Modifiers)
* **Implementation:** All state variables (like `name`, `age`, and `petsAdopted`) are marked `private`.
* **Benefit:** Data is protected from unauthorized outside access. Interaction with these variables is strictly controlled through `public` Getter and Setter methods, ensuring data integrity.

## 🚀 How to Run
1. Ensure you have the **JDK** installed.
2. Compile the files:  
   `javac *.java`
3. Run the application:  
   `java PetAdoptionSystem`