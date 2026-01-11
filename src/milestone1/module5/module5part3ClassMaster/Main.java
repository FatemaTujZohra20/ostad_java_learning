package milestone1.module5.module5part3ClassMaster;

public class Main {
    public static void main(String[] args) {
//        int mileage1 = 5;
//        int mileage2 = 5;
//        System.out.println(mileage1 == mileage2);  // true

//        Car car1 = new Car("a", "b", 1.5);
//        Car car2 = new Car("c", "d", 3.5);
//
//        System.out.println(car1==car2);  // false
//        System.out.println(car1.equals(car2));  //false

        ToyotaCar toyotaCar = new ToyotaCar();
        toyotaCar.setColor("Blue");
        System.out.println(toyotaCar.getColor());

        toyotaCar.doSomething();   // -->> Override

    }
}
