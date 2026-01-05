package milestone1.module2.module2part2;

import java.util.Scanner;

public class ConsoleInputAndOutput {
    public static void main(String[] args){
//        char c = 'a';
//        System.out.println(c + " " + c);


        //        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        cars[0] = "Opel";
//        System.out.println(cars[0]);
//        System.out.println(cars.length);

//        for(int i = 0; i < cars.length; i++){
//            System.out.println(cars[i]);
//        }


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

//        // An array storing different ages
//        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
//
//        // Get the length of the array
//        int length = ages.length;
//
//        // Create a 'lowest age' variable and assign the first array element of ages to it
//        int lowestAge = ages[0];
//
//        // Loop through the elements of the ages array to find the lowest age
//        for (int age : ages){
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
//        int[] numbers = {45, 12, 98, 33, 27};
//
//        int max = numbers[0];
//        int min = numbers[0];
//
//        for (int n : numbers){
//            if (n > max){
//                max = n;
//            }
//            if (n < min){
//                min = n;
//            }
//        }
//
//        System.out.println("Max : " + max);
//        System.out.println("Min : " + min);



        // ---------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//
//        // User Input + Declaration + Assignment  - Start
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.println("Enter your gpa: ");
//        float gpa = scanner.nextFloat();
//
//        System.out.println("Are you a student? (true/false)");
//        boolean isStudent = scanner.nextBoolean();
//
//        // User Input + Declaration + Assignment  - End
//
//

        // ---------------------------------------------------
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old!");
//        System.out.println("Your gpa is: " + gpa);
//
//        if(isStudent){
//            System.out.println("You are a student.");
//        }
//        else{
//            System.out.println("You are not a student!");
//        }

        // Common Issues
        // It happens while working with Int & Double
        // String -> TO DO

//        System.out.print("Enter your class ID : ");
//        int ID = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Enter your favorite color: ");
//        String color = scanner.nextLine();
//
//
//        System.out.println("Your class id is: " + ID);
//        System.out.println("Your favorite color is: " + color);


        // Calculating the area
        // ---------------------------------------------------
//        double height;
//        double width;
//        double area;
//
//        System.out.println("Enter the height: ");
//        height = scanner.nextDouble();
//
//        System.out.println("Enter the width: ");
//        width = scanner.nextDouble();
//
//        area = height * width;
//
//        System.out.println("The height is: " + height);
//        System.out.println("The width is: " + width);
//        System.out.println("Total area: " + area + "cm^2");

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name ?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");


//        scanner.close();
        sc.close();

    }
}
