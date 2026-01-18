package milestone2.module8.module8exception;

import java.util.Scanner;

public class ExceptionBasics01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("First Number: ");
            int first = sc.nextInt();
            System.out.println("Second Number: ");
            int second = sc.nextInt();

            // Initial Step to learn Exception
//            try {
//                System.out.println("Division: " + first / second);
//            } catch (Exception e) {
//                System.out.println("There was an error while doing that operation " + e.getMessage());
//                System.out.println(e);
//            }

            // 2nd step   --->>> Right hierarchy
            try {
                System.out.println("Division: " + first / second);
            } catch (NullPointerException e) {
                System.out.println("There are an error while regarding null pointer doing that operations " + e);

            } catch (ArithmeticException e) {
                System.out.println("There was an error while doing that operation " + e.getMessage());
                System.out.println(e);
            } catch (Exception e) {
                System.out.println("There was an unknown error  " + e.getMessage());
            }



            // 3rd Step to understand the need of Exception hierarchy  -[ Wrong way to write exception hierarchy.]
//            try {
//                System.out.println("Division (First/Second) : " + first / second);
//            } catch (Exception e) {
//                System.out.println("There was an unknown error  " + e.getMessage());
//            } catch (NullPointerException e) {
//                System.out.println("There was an error while regarding null pointer doing that operation " + e.getMessage());
//            } catch (ArithmeticException e) {
//                System.out.println("There was an error while doing that operation " + e.getMessage());
//            }


        }

    }
}
