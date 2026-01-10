package milestone1.module4.module4part1;

import java.util.Scanner;

public class DefiningAndCallingMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.print("Please enter your age: ");
//        int myAge = input.nextInt();
//        checkAge(myAge);

//        int asd = 132;
//        checkAge(asd);

//        sum(2, 3);

//        checkAge(12);
//        checkage(30, "Meem");

//        int a = 1;
//        System.out.println(inc(a));


        int frst = 1, scnd = 1;
        System.out.println("preInc: " + preInc(frst) + " " + "postInc: " + postInc(scnd));

    }

    public static void checkAge(int age){
        if(age >= 18){
            System.out.println("You are ok!");
        }
        else{
            System.out.println("You are child!");
        }
    }


    public static int sum(int a, int b){
        int s = a+b;
        System.out.println("The sum is: " + s);
        return s;
    }


    public static void checkage(int age, String name){
        if (age >= 18) {
            System.out.println(name + " are ok!");
        }
        else {
            System.out.println(name + " are child!");
        }
    }


    public static int inc(int a){
        return a+1;  // a+=1 will give the same 2 value but a++ will not give the same value
    }


    public static int postInc(int a){
        return a++;
    }


    public static int preInc(int a){
        return ++a;
    }


//    public static int sum(int a, int b){
//        return a+b;
//    }
}
