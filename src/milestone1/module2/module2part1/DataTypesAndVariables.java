package milestone1.module2.module2part1;

public class DataTypesAndVariables {
    int xStatic = 5;
    public static void main(String[] args) {

//        System.out.println("Class Scope: " + xStatic);  //--->>> A problem
        DataTypesAndVariables classObject = new DataTypesAndVariables();
        System.out.println(classObject.xStatic);

        // Variables are containers for storing data values.

        // --------------------   Primitive Data Types  ----------------------------

        int age = 30;
        int year = 2025;
        int quantity = 1;

        System.out.println("This year is " + year);

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("$" + price);  // American unit of currency = $

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        boolean isStudent = true;   // -> camelCase = naming convention
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);

//        if(isStudent){
//            System.out.println("You are a student!!");
//        }
//        else{
//            System.out.println("You are NOT student!!!");
//        }


        // --------------------   Reference Data Types  ----------------------------

        String name = "Bro Code";
        String food = "Pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";


        System.out.println(name);

        // String concatenation

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your favourite food is: " + food);
        System.out.println("Your email is " + email);

        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);


        // Printing a line of 30 hyphens for clear code readability
        for (int i = 0; i < 30; i++){
            System.out.print("-");
        }
        System.out.println();



        // Size of Primitive data types
        // Ghazanfar vai class
        System.out.println("Byte.SIZE : " + Byte.SIZE);    // It will show results in bit, 1 byte = 8 bits
        System.out.println("Short.SIZE : " + Short.SIZE);
        System.out.println("Integer.SIZE : " + Integer.SIZE);
        System.out.println("Long.SIZE : " + Long.SIZE);

        System.out.println("float.SIZE : " + Float.SIZE);
        System.out.println("Double.SIZE : " + Double.SIZE);

        System.out.println("Character.SIZE : " + Character.SIZE);

        /*
        *   Primitive Data Types
        * ____________________________
        *   Byte.SIZE : 8
            Short.SIZE : 16
            Integer.SIZE : 32
            Long.SIZE : 64
            float.SIZE : 32
            Double.SIZE : 64
            Character.SIZE : 16
            *
        * */

    }
}
