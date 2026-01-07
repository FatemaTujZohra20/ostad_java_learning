package milestone1.module3.basic_learning2;

public class ArrayW3School {
    public static void main(String[] args) {
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        cars[0] = "Opel";
//        System.out.println(cars[0]);
//        System.out.println(cars.length);
//
//        for(int i = 0; i < cars.length; i++){
//            System.out.println(cars[i]);
//        }
//
//
//        String[] seats = {"Jenny", "Liam", "Angie", "Bro"};
//
//        for(int i = 0; i < seats.length; i++){
//            System.out.println("Seat number " + i + " is taken by " + seats[i]);
//        }



        //________________________________________
        //             Array  Exercises
        //________________________________________

        // Array Example - 01
        //--------------------------------------
        // An array storing different ages
//        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
//
//        float avg;
//        float sum = 0;
//
//        // Get the length of the array
//        int length = ages.length;
//
//        // Loop through the elements of the array
//        for (int age : ages) {
//            sum += age;  // x = x + y  -->> x += y
//        }
//
//        // Calculate the average by dividing the sum by the length
//        // Average counting
//        //------------------
//        avg = sum / length;
//
//        // Print the average
//        // ---------------------------
//        System.out.println("The average is: " + avg);



        // Array Example - 02
        //--------------------------------------
        // The lowest age among different ages

        // An array storing different ages
//        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
//
//        // Get the length of the array
//        int length = ages.length;
//
//        // Create a 'lowest age' variable and assign the first array element of ages to it
//        int lowestAge = ages[0];
//
//        // Loop through the elements of the ages array to find the lowest age
//        for (int age : ages){    // Enhanced for loop
//            // Check if the current age is smaller than the current 'lowest age'
//            if (lowestAge > age){
//                // If the smaller age is found, update 'lowest age' with that element
//                lowestAge = age;
//            }
//        }
//
//        // Output the value of the lowest age
//        System.out.println("The lowest age in the array is: " + lowestAge);


        // Array Example - 03
        //--------------------------------------
        // Create a program with a list of numbers where you want to skip negative values,
        // but stop completely if you find a zero:
//        int[] numbers = {3, -1, 7, 0, 9};
//
//        for (int n : numbers) {
//            if (n < 0){
//                continue;
//            }
//            if (n == 0){
//                break;
//            }
//            System.out.println(n);
//        }



        // Array Example - 04
        //--------------------------------------
        // Create a program that keeps track of the highest and lowest values in an array:
        int[] numbers = {45, 12, 98, 33, 27};

        int max = numbers[0];
        int min = numbers[0];

        for (int n : numbers){
            if (n > max){
                max = n;
            }
            if (n < min){
                min = n;
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);

    }
}
