package milestone1.module3.module3Assignment;

import java.util.Scanner;

public class ConsoleATMMachineSimulator {
    public static void main(String[] args){

        double currentBalance = 1000;

        int userChoice;

        boolean exitProgram = false;

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Welcome to the Simple Console ATM!");
            System.out.println("Please select an option: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit");
            userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    // Checking the balance
                    System.out.println("Your balance is: " + currentBalance + " taka.");
                    System.out.println();
                    break;

                case 2:
                    // Deposit Funds and check the current balance
                    double depositAmount;
                    double balanceAfterDeposit;

                    System.out.println("Enter the amount of funds you want to deposit: ");
                    depositAmount = input.nextDouble();

                    if (depositAmount == 0){
                        // If the user accidentally input zero (0) in the "deposit funds" prompt,
                        // this ATM is able to give a message that the user cannot deposit zero amount.
                        System.out.println("Deposit funds cannot be zero.");
                        System.out.println("Please enter a valid amount!");
                        System.out.println();

                    } else if (depositAmount > 0) {
                        // If the user input an amount greater than zero, it will be a valid input.
                        balanceAfterDeposit = currentBalance + depositAmount;

                        double newCurrentBalanceAfterDeposit;
                        newCurrentBalanceAfterDeposit = balanceAfterDeposit;
                        currentBalance = newCurrentBalanceAfterDeposit;

                        System.out.println("You have successfully deposited " + depositAmount + " taka " +
                                "and your current balance is " + currentBalance + " taka.");
                        System.out.println();
                    } else {
                        // By default, this section is indicating that deposit funds cannot be negative.
                        System.out.println("Deposit funds cannot be negative!");
                        System.out.println("Please enter a valid amount!");
                        System.out.println();

                    }
                    break;

                case 3:
                    // Withdraw funds and check the current balance
                    // A user cannot withdraw zero amount, negative amount, exceed maximum withdrawal limit(<=100),
                    // and user's withdrawal amount cannot be exceeded available balance.
                    // This ATM can check all these things while taking input from the user.
                    double withdrawAmount;
                    double balanceAfterWithdraw;

                    System.out.println("Enter the amount of funds you want to withdraw: ");
                    withdrawAmount = input.nextDouble();

                    if (withdrawAmount == 0){
                        // If user input zero amount
                        System.out.println("Withdraw amount can not be zero.");
                        System.out.println("Please enter a valid amount.");
                        System.out.println();

                    } else if (withdrawAmount < 0){
                        // If user accidentally input a negative amount
                        System.out.println("Withdraw amount can not be negative.");
                        System.out.println("Please enter a valid amount.");
                        System.out.println();

                    }  else if (withdrawAmount > currentBalance){
                        // withdraw amount can not be greater than the current balance
                        System.out.println("Insufficient Balance!");
                        System.out.println("Your current balance is: " + currentBalance + " taka.");
                        System.out.println();

                    } else if (withdrawAmount > 100) {
                        // As per given instruction, withdraw amount can be maximum of 100 taka
                        System.out.println("Invalid Withdraw Amount!");
                        System.out.println("You can only withdraw a maximum of 100 taka per transaction.");
                        System.out.println("Please enter a valid amount!");
                        System.out.println();

                    } else{
                        // Calculation of new balance after withdrawal
                        balanceAfterWithdraw = currentBalance - withdrawAmount;

                        double newCurrentBalanceAfterWithdraw;
                        newCurrentBalanceAfterWithdraw = balanceAfterWithdraw;
                        currentBalance = newCurrentBalanceAfterWithdraw;

                        System.out.println("You have successfully withdrawn " + withdrawAmount + " taka " +
                                "and your current balance is " + currentBalance + " taka.");
                        System.out.println();
                    }
                    break;

                case 4:
                    exitProgram = true;
                    break;

                default:
                    System.out.println("Invalid Input! Please Select an options from 1 to 4.");
                    System.out.println();
            }

            if (exitProgram){
                System.out.println("Thank you for using the ATM! Goodbye.");
                break;
            }
        }

        input.close();
    }
}
