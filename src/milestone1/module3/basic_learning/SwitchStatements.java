package milestone1.module3.basic_learning;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Switch inside a for loop
        for(int i=0; i<5; i++){
            int num = input.nextInt();
            switch (num) {
                case 7:
                    System.out.println("Lucky");
                    break;
                case 13:
                    System.out.println("Unlucky");
                    break;
                case 54:
                    System.out.println("Half lucky");
                    break;
                default:
                    System.out.println("Invalid number");
            }
        }



//        int num = input.nextInt();
//        switch (num) {
//            case 7:
//                System.out.println("Lucky");
//                break;
//            case 13:
//                System.out.println("Unlucky");
//                break;
//            case 54:
//                System.out.println("Half lucky");
//                break;
//            default:
//                System.out.println("Invalid number");
//        }





//        int day = 4;
//        //int day = 11;   // For default use case
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Looking forward to the weekend");
//                // The default keyword specifies some code to run if there is no case match
//        }
    }
}
