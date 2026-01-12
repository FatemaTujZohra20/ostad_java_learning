package milestone1.module6.module6part1;

class A {
    public void printSomething() {
//        System.out.println("Hello World");

        // it shows the location
        System.out.println(this + " Hello World");

    }
}


class B extends A { }


public class Inheritance02 {
    public static void main(String[] args) {
        // Normal scenery
        // -----------------------------
//        A a = new A();
//        a.printSomething();   // Hello World

        // B inherited A
//        B b = new B();
//        b.printSomething();  // Hello World

        // The two objects (a & b) are coming from two different classes and
        // the (this + "Hello World") represents the fact descriptively
        // basically it shows the location
        // ---------------------------------------------------------------------
        A a = new A();
        a.printSomething();  // milestone1.module6.module6part1.A@7b23ec81 Hello World

        B b = new B();
        b.printSomething();  // milestone1.module6.module6part1.B@6f496d9f Hello World

    }
}
