package milestone1.module3.basic_learning2;

import java.util.Scanner;

public class LoopingConstructs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int num = sc.nextInt();
        //Decimal to binary
        // By using while loop
//        while (num > 0){
//            int lastDigit = num % 2;
//            num = num / 2;
//
//            System.out.println(lastDigit + " -> " + num);
//            System.out.println(lastDigit);
//        }


        // By using for loop
        for(int num = sc.nextInt(); num > 0; num /= 2){
            int lastDigit = num % 2;
            System.out.println(lastDigit + " -> " + num);
        }


//        for(int i = 1; (i < 10 && i % 5 != 0); i++){
//            System.out.println(i);
//        }


    }
}
