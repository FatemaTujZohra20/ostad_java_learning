package milestone1.module4.module4part2;

public class AdvancedMethodConcepts {
//    public static int add(int a, int b){
//        return a + b;
//    }
//
//    public static double add(double a, double b){
//        return a + b;
//    }

    // Recursion = reoccurrence
    public static void eat(int pizzaSize){
        System.out.println("Current Pizza Size: " + pizzaSize);
        if(pizzaSize < 2){
            System.out.println("I don't have enough to eat. :(");
            return;
        }
        System.out.println("Eating ...");
        pizzaSize -= 2;
        eat(pizzaSize);
    }


    public static void main(String[] args){

//        System.out.println(add(2, 3));
//        System.out.println(add(2.5, 3));

        eat(40);

    }

}
