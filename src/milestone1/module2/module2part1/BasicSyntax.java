package milestone1.module2.module2part1;

import java.util.Scanner;

public class BasicSyntax {
    public static void main(String[] args) {
        // User input + output
        Scanner input = new Scanner(System.in);

        // primitive data types - start

        int age = 15;
        int ageAfter5Years = age + 5;
        float salary = 50.5f;
        double doubleSalary = 1.234;
        boolean bool = true;
        boolean f = false;
        char ch = 'A';

        // primitive data type - end


        // non-primitive data type - start

        String str = "Hello world";
        String str2 = "How are you";

        Integer wrapper = 5;

//        str = input.nextLine();
//        salary = input.nextFloat();

//        System.out.println(str);

//        System.out.println("Enter your name: ");
//        String name = input.nextLine();
//
//        System.out.println("Your name is: " + name);


        // If-else

//        if(name.equals("Meem")){
//            System.out.println("Welcome Meem.");
//        } else {
//            System.out.println("Sorry you are not welcome.");
//        }


//        ==, >, <, >=, <=, // operators for conditional checking
//
//        5 > 10 -> false
//        10 > 5 -> true


        // Loop

        // Approach without loop

//        System.out.println("My name is Meem");
//        System.out.println("My name is Meem");
//        System.out.println("My name is Meem");
//        System.out.println("My name is Meem");
//        System.out.println("My name is Meem");


        // Approach with loop
        // for-loop
//        for(int i = 0; i < 5; i++){
//            System.out.println(i + ". My name is Meem.");
//        }
        // i++  ( i = i + 1)

//
//        for (int i = 2; i <= 10; i = i + 2){
//            System.out.println("even number: " + i);
//        }

        // for loop ends here

        // while loop starts here
//
//        int number = 0;
//        while (number < 5){
//            System.out.println(number + ". My name is Meem");
//            number++;    // number = number + 1;
//        }


        Book banglaBoi = new Book();
        banglaBoi.name = "Amar bangla boi";
        banglaBoi.author = "Abul kashem";
        banglaBoi.publication = "Podda Publication";
        banglaBoi.price = 50;

        System.out.println("book name: "+ banglaBoi.name);
        System.out.println("book author: "+ banglaBoi.author);
        System.out.println("book publication: "+ banglaBoi.publication);
        System.out.println("book price: "+ banglaBoi.price);


    }

}
