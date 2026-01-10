package milestone1.module3.module3project;

import java.util.Scanner;

public class SimpleGradingSystem {
    public static void main(String[] args){
        Scanner input = new Scanner((System.in));

        double marks;
        String grade;
        String verdict;

        System.out.println("Enter your marks below: ");
        marks = input.nextDouble();

        if(marks > 100) {
            System.out.println("Marks cannot be greater than 100");
        }
        if(marks < 0){
            System.out.println("Marks cannot be less than 0");
        }

        if(marks <= 100 && marks >= 90){
            grade = "A";
            verdict = "Excellent";
            System.out.println("Your grade is " + grade + " and your verdict is " + verdict);
        } else if (marks <= 89 && marks >= 80){
            grade = "B";
            verdict = "Good";
            System.out.println("Your grade is " + grade + " and your verdict is " + verdict);
        } else if (marks <=79 && marks >= 70){
            grade = "C";
            verdict = "Average";
            System.out.println("Your grade is " + grade + " and your verdict is " + verdict);
        } else if (marks <= 69 && marks >=60){
            grade = "D";
            verdict = "Below Average";
            System.out.println("Your grade is " + grade + " and your verdict is " + verdict);
        } else if (marks < 60 && marks >= 0){
            grade = "F";
            verdict = "Fail";
            System.out.println("Your grade is " + grade + " and your verdict is " + verdict);

            if(marks <= 59 && marks >= 50){
                System.out.println("You almost got it. Try a little harder next time.");
            } else if (marks <= 49 && marks >= 40){
                System.out.println("Study more seriously than you do.");
            } else{
                System.out.println("Meet me at my office tomorrow. We need to have a serious discussion.");
            }
        }
    }
}
