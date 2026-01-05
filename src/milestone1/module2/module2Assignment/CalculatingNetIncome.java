package milestone1.module2.module2Assignment;

import java.util.Scanner;

public class CalculatingNetIncome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Here, I am taking "Inputs"  only  'one time' for both the 'sales data' & 'cost data' at the beginning
        // of this code structure for "the total number of units (kg/litre) for potato, onion, and oil",
        // because --->
        // 'sales data' and 'cost data' must consistently reference the same quantity of goods when calculating
        // a reliable 'net income'.

        double totalNumberOfUnitsOfPotato;
        double totalNumberOfUnitsOfOnion;
        double totalNumberOfUnitsOfOil;

        System.out.println("Enter the total number of units (kg) of Potato: ");
        totalNumberOfUnitsOfPotato = sc.nextDouble();

        System.out.println("Enter the total number of units (kg) of Onion: ");
        totalNumberOfUnitsOfOnion = sc.nextDouble();

        System.out.println("Enter the total number of units (litre) of Oil: ");
        totalNumberOfUnitsOfOil = sc.nextDouble();
        System.out.println();


        // 1. Input Collection (Sales Data):
        //_________________________________________________________________

        double sellingPriceForPotato;
        double sellingPriceForOnion;
        double sellingPriceForOil;

        // Taking the Selling price for Potato
        // ------------------------------------
        System.out.println("Enter the selling price per kg for Potato: ");
        sellingPriceForPotato = sc.nextDouble();

        // Taking the Selling price for Onion
        // -----------------------------------
        System.out.println("Enter the selling price per kg for Onion: ");
        sellingPriceForOnion = sc.nextDouble();

        // Taking the Selling price for Oil
        // -------------------------------------
        System.out.println("Enter the selling price per litre for Oil: ");
        sellingPriceForOil = sc.nextDouble();
        System.out.println();


        // 2. Calculate Total Sold Price (Revenue)
        //____________________________________________________________________

        // Calculating Revenue for Potato
        // --------------------------------
        double calculateIndividualRevenueForPotato = totalNumberOfUnitsOfPotato * sellingPriceForPotato;

        // Calculating Revenue for Onion
        // --------------------------------
        double calculateIndividualRevenueForOnion = totalNumberOfUnitsOfOnion * sellingPriceForOnion;

        // Calculating Revenue for Oil
        // --------------------------------
        double calculateIndividualRevenueForOil = totalNumberOfUnitsOfOil * sellingPriceForOil;


        // Calculate the Total Sold Price (Gross Revenue)
        // ################################################
        double totalSoldPrice = calculateIndividualRevenueForPotato +
                calculateIndividualRevenueForOnion +
                calculateIndividualRevenueForOil;


        // 3. Input Collection (Cost Data):
        //______________________________________________________________________

        double purchasingPriceForPotato;
        double purchasingPriceForOnion;
        double purchasingPriceForOil;


        // Taking Purchasing price for Potato
        // ------------------------------------
        System.out.println("Enter the purchasing price per kg for Potato: ");
        purchasingPriceForPotato = sc.nextDouble();

        // Taking the Purchasing price for Onion
        // -----------------------------------
        System.out.println("Enter the purchasing price per kg for Onion: ");
        purchasingPriceForOnion = sc.nextDouble();

        // Taking the Purchasing price for Oil
        // -------------------------------------
        System.out.println("Enter the purchasing price per litre for Oil: ");
        purchasingPriceForOil = sc.nextDouble();


        // Taking the Transportation Cost (an Operating expense)
        //--------------------------------------------------------
        double totalTransportationCost;
        System.out.println("Enter the Total Transportation Cost: ");
        totalTransportationCost = sc.nextDouble();


        // 4. Calculate Total Cost (COGS)
        //______________________________________________________________________

        // Calculating Purchasing Price for Potato
        // ------------------------------------------
        double calculateIndividualPurchaseForPotato = totalNumberOfUnitsOfPotato * purchasingPriceForPotato;

        // Calculating Purchasing Price for Onion
        // -------------------------------------------
        double calculateIndividualPurchaseForOnion = totalNumberOfUnitsOfOnion * purchasingPriceForOnion;

        // Calculating Purchasing Price for Oil
        // ---------------------------------------
        double calculateIndividualPurchaseForOil = totalNumberOfUnitsOfOil * purchasingPriceForOil;



        // Calculate the Total Purchase Cost Price (COGS = Cost of Goods Sold)
        // ####################################################################
        double totalPurchaseCost = calculateIndividualPurchaseForPotato +
                calculateIndividualPurchaseForOnion +
                calculateIndividualPurchaseForOil;


        // OUTPUTS according to the given instructions
        //______________________________________________________________________
        //______________________________________________________________________

        System.out.println();
        System.out.println("Grocery Store Net Income Calculator");
        System.out.println("--- Sales Data ---");
        System.out.println("Potato Revenue: " + calculateIndividualRevenueForPotato);
        System.out.println("Onion Revenue: " + calculateIndividualRevenueForOnion);
        System.out.println("Oil Revenue: " + calculateIndividualRevenueForOil);
        System.out.println("Total Sold Price (Revenue): " + totalSoldPrice);
        System.out.println("--- Cost Data ---");
        System.out.println("Potato Purchase Cost: " + calculateIndividualPurchaseForPotato);
        System.out.println("Onion Purchase Cost: " + calculateIndividualPurchaseForOnion);
        System.out.println("Oil Purchase Cost: " + calculateIndividualPurchaseForOil);
        System.out.println("Total Purchase Cost (COGS): " + totalPurchaseCost);
        System.out.println("Total Transportation Cost: " + totalTransportationCost);


        // 5. Calculate Net Income
        //________________________________________________________________________
        System.out.println("--- Final Result ---");
        double netIncome = totalSoldPrice - (totalPurchaseCost + totalTransportationCost);
        System.out.println("Net Income: " + netIncome);

        sc.close();

        // Outcome
        // ------------------------------------------------------------------
    /*
    Enter the total number of units (kg) of Potato:
    1
    Enter the total number of units (kg) of Onion:
    2
    Enter the total number of units (litre) of Oil:
    3

    Enter the selling price per kg for Potato:
    20
    Enter the selling price per kg for Onion:
    30
    Enter the selling price per litre for Oil:
    40

    Enter the purchasing price per kg for Potato:
    10
    Enter the purchasing price per kg for Onion:
    15
    Enter the purchasing price per litre for Oil:
    20
    Enter the Total Transportation Cost:
    30

    Grocery Store Net Income Calculator
    --- Sales Data ---
    Potato Revenue: 20.0
    Onion Revenue: 60.0
    Oil Revenue: 120.0
    Total Sold Price (Revenue): 200.0
    --- Cost Data ---
    Potato Purchase Cost: 10.0
    Onion Purchase Cost: 30.0
    Oil Purchase Cost: 60.0
    Total Purchase Cost (COGS): 100.0
    Total Transportation Cost: 30.0
    --- Final Result ---
    Net Income: 70.0
     */

    }
}
