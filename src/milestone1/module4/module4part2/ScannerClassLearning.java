package milestone1.module4.module4part2;

import java.util.Scanner;


public class ScannerClassLearning {
    public static void main(String args[]) {

    // ______________________________________________________________________________
    // To understand hasNext(), just do the following code
//        Scanner input = new Scanner(System.in);
//
//        if (input.hasNext()){
//            System.out.println("User typed something!");
//        }
    // ______________________________________________________________________________


    // ______________________________________________________________________________
    // To understand hasNextX(), just do the following code
//        Scanner input = new Scanner(System.in);
//
//        if (input.hasNextDouble()){
//            double x = input.nextDouble();
//            System.out.println("Printing the double: " + x);
//        } else {
//            System.out.println("Invalid Input");
//            input.next();
//        }


    // ___________________________________________________________________________
    // Correct professional input loop
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("You Entered into the loop");

            if (input.hasNextDouble()) {
                double x = input.nextDouble();

                System.out.println("You entered: " + x);
                break;
            } else {
                System.out.println("Invalid Input");
                input.next();   // without it, the loop becomes infinite
            }
        }

    }
}


