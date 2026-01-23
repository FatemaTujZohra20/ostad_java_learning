package milestone2.module8.module8exception;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int c = 22;
        int d = 0;

        try{
            d = 18/c;
            if (d == 0)
                throw new MyException("I don't want to print this");
        } catch (MyException e) {
            d = 18/c;
            System.out.println("That is the default output " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong!" + e);
        }

        System.out.println("d = " + d);
        System.out.println("Bye");
    }
}
