package milestone1.module3.basic_learning2;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[] names = new String[4];
        int[] numbers = new int[4];

        // Taking the Inputs
        int index;
        for(index =0; index <3; index++){
            System.out.print("Please enter the name of your " + (index+1) + "th student: ");
            names[index] = input.nextLine();

            System.out.print("Please enter the number of your " + (index+1) + "th student: ");
            numbers[index] = input.nextInt();
            input.nextLine();
        }

        // Printing the Outputs
        for(index =0; index <3; index++){
            System.out.println(names[index] + ": " + numbers[index]);
        }

        input.close();
    }
}
