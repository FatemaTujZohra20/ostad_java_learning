package milestone1.module3.basic_learning2;

public class ArrayW3School {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);

        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }


        String[] seats = {"Jenny", "Liam", "Angie", "Bro"};

        for(int i = 0; i < seats.length; i++){
            System.out.println("Seat number " + i + " is taken by " + seats[i]);
        }
    }
}
