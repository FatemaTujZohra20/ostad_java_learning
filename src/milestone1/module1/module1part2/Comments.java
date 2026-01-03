package milestone1.module1.module1part2;

public class Comments {
    public static void main(String[] args) {
        // Comments are non-executable statements ignored by the compiler.
        // Java supports three types of comments:

        // 01. Single-line comment (//)
        // ---------------------------------------------------------
        System.out.println("Learning comments in Java");  // This is a single-line comment


        // 02. Multi-line comments  (/* ... */)
        // ---------------------------------------------------------
        System.out.println(" Used for longer comments or to comment out blocks of code. " +
                            "Any text between /* and */ is ignored.");

        /*
        This is a multi-line comment.
        It can span multiple lines.
        */

        // 03. Documentation Comments (/** ... */)
        // ---------------------------------------------------------

        // The following kind of comment is called Documentation comments->

             // /**
             // * Calculates the average of three numbers.
             // * @param num1 The first number.
             // * @param num2 The second number.
             // * @param num3 The third number.
             // * @return The average of the three numbers.
             // */

    }
}
