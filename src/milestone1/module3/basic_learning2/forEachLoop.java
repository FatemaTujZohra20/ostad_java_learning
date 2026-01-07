package milestone1.module3.basic_learning2;

public class forEachLoop {
    public static void main(String[] args){
        String[] names = {"Meem", "Zubayer", "Fatema", "Zohra"};

        // for each loop = extended for loop
        // Regular Loop
        for(int index = 0; index < 4; index++){
            String name = names[index];
            System.out.println(name);
        }

        // For each loop
        for(String name : names){
            System.out.println(name);
        }
    }
}
