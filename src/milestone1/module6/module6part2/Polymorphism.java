package milestone1.module6.module6part2;

class Calculator {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public void explain() {
        System.out.println("This is a simple calculator :)");
    }
}

class ScientificCalculator extends Calculator {
    public void explain() {
        System.out.println("This is a scientific calculator :o");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Something.. ");
        System.out.println("Sum is: " + (Calculator.sum(1, 2, 3)));
        System.out.println("Sum is: " + (Calculator.sum(1, 2)));

        Calculator calc = new Calculator();
        ScientificCalculator sci = new ScientificCalculator();

        calc.explain();
        sci.explain();
    }
}
