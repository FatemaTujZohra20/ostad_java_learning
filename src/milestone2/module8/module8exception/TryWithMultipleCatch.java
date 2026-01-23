package milestone2.module8.module8exception;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        String str = null;

        int[] num = new int[5];

        try
        {
//            y = 18/ x;
            System.out.println(str.length());
            System.out.println("num1: " + num[1]);
            System.out.println("num out of limit : " + num[5]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero" + e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit!" + e);
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong..." + e);
        }

        System.out.println("y = " + y);

        System.out.println("Bye");
    }
}
