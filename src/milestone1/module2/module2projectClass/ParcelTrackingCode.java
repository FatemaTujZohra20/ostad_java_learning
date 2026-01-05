package milestone1.module2.module2projectClass;

import java.util.Scanner;

public class ParcelTrackingCode {
    public static void main(String[] args){
        int nextTrackingId;
        int weight;

        Scanner sc = new Scanner(System.in);

        System.out.println("The tracking ID : ");
        String trackingId = sc.nextLine();

        nextTrackingId = Integer.parseInt(trackingId.split("-")[1]) + 1;
        weight = (int) Float.parseFloat(trackingId.split(":")[1]);

        System.out.println("Next tracking id : " + nextTrackingId);
        System.out.println("Weight without decimal point : " + weight);

        sc.close();

        // Output
        // -----------------------
        /*
        The tracking ID :
        ID-90345-WEIGHT:25.87
        Next tracking id : 90346
        Weight without decimal point : 25
         */
    }
}
