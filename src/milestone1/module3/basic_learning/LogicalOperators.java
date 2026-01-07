package milestone1.module3.basic_learning;

public class LogicalOperators {

    public static void main(String[] args) {
        // Java Logical Operators in Conditions

        // && (AND) - all conditions must be true
        // Problem - 01
        // ---------------
        // Test if a is greater than b, and if c is greater than a:
        // --------------------------------------------------------------
//        int a = 200;
//        int b = 33;
//        int c = 500;
//
//        if(a > b && c > a){
//            System.out.println("Both conditions are true.");
//        }

        // || (OR) - at least one of the conditions can be true
        // Problem - 02
        // ---------------
        // Test if a is greater than b, and if a is greater than c:
        // --------------------------------------------------------------
//        int a = 200;
//        int b = 33;
//        int c = 500;
//
//        if (a > b || a > c){
//            System.out.println("At least one conditions is true.");
//        }


        // ! (NOT) - to reverse a condition
        // Problem - 03
        // ---------------
        // Test if a is not greater than b:
        // -----------------------------------
//        int a = 33;
//        int b = 200;
//
//        if(! (a > b)){
//            System.out.println("a is NOT greater than b.");
//        }


        // Real - Life  Example
        // --------------------------
        // In real programs, logical operators are often used for access control.
        // For example, to get access to a system, there are specific requirements:
        // ---- You must be logged in, and then you either need to be an admin,
        // or have a high security clearance (level 1 or 2):
        //_________________________________________________________________________________
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 1 = highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        // Try changing securityLevel 1 = Access granted
        // securityLevel 2 = Access granted
        // securityLevel 3 = Access denied
        // securityLevel 4 = Access denied
        //
        // If isAdmin = true, access is granted.


    }
}
