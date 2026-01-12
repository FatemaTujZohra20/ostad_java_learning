package milestone1.module6.module6part1;

/*
    We will try to understand from top to bottom of this section about
    the fact if we really need the "static" word inside the main signature entry point of Java ->
    " public static void main(String[] args) {} "
    Do we really need to write the "static" word ?
*/


//class BankAccount{
//    public int getBalance() {
//        return balance;
//    }
//
//    public void setBalance(int balance) {
//        BankAccount.balance = balance;
//    }
//
//    public static void printBankName() {
//        System.out.println("Ostad Commercial Bank Ltd.");
//        System.out.println("My balance " + balance);
//    }
//
//    private static int balance = 100;
//
//}


class Counter{
    private static int current;

    public Counter(){
        current = 0;
    }

    public void increment(){
        current++;
    }

    public void showCurrent(){
        System.out.println("Current is " + current);
    }

}


public class StaticTest {
    public static void main(String[] args) {
//        BankAccount.printBankName();
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        counter1.showCurrent();
        counter2.showCurrent();
        counter3.showCurrent();


        counter1.increment();
        counter2.increment();
        counter3.increment();
        // Here output is Zero for all

        counter1.showCurrent();
        counter2.showCurrent();
        counter3.showCurrent();


//        counter1.increment();
//        counter1.showCurrent();
//
//        counter2.increment();
//        counter2.showCurrent();
//
//        counter3.increment();
//        counter3.showCurrent();

    }


    // multi-level inheritance
//    class A {
//
//    }
//
//    class B  extends A {
//
//    }
//
//    class C extends B {
//
//    }
//
     //

    // A -> [B, D, E] // Hierarchical inheritance
//    class D extends A {
//
//    }
//
//    class E extends A {
//    }

}


// Multiple inheritance directly not allowed in Java, for Diamond problem
//class Human{
//    explain()
//}
//
//class Student extends Human{
//    explain()
//
//}
//class Teacher extends Human{
//    explain()
//}
//
//
//class someClass extends Student, Teacher{
//    //  Multiple inheritance directly not allowed in Java
//}
//
//sc.explain()
