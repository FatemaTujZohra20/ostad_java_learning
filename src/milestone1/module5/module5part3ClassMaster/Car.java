package milestone1.module5.module5part3ClassMaster;

public class Car {
    String color;
    String brand;
    double mileage;

    // No-argument constructor
    public Car(){

    }


    // All-argument constructor
    public Car(String color, String brand, double mileage) {
        this.color=color;
        this.brand=brand;
        this.mileage=mileage;
    }


    // Setter
    public void setColor(String color) {
        this.color=color;
    }


    // Getter
    public String getColor() {
        return color;
    }


    public void doSomething() {
        System.out.println("Car");
    }
}
