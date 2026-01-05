package milestone1.module2.module2projectClass;

public class SimpleInterestCalculator {
    public static void main(String[] args){
        int principalAmount = 10000;
        float interestRate = 5;
        String time = "2.5y";

        // Gets the string without the last character
        // Example: ("20m") -> ("20"), ("8y") -> ("8")
        String timeValue = time.substring(0, time.length() - 1);

        // Parse the value into expected data type
        // Example: ("2.5") -> (2.5)
        float timeFloat = Float.parseFloat(timeValue);

        // If time is in months, the line below will convert it into years.
        // float timeYears = timeFloat / 12;

        // Finally putting our values in the formula.
        double interest = (principalAmount * interestRate * timeFloat) / 100;

        System.out.println("Interest is " + interest);
    }
}
