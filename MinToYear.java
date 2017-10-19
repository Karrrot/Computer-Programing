import java.util.Scanner;

public class MinToYear{
    public static void main (String[] args) {
        // Declared constants
        final int DAYS_IN_YEAR = 365;
        final int MINS_IN_DAY = 1440;
        
        // Declared variable
        double minutes, days, years;
        
        // Set up input object
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        minutes = input.nextLong();
        
        // Calculate the number of days and years
        days = minutes / (MINS_IN_DAY);
        years = days / DAYS_IN_YEAR;
        
        // Display results
        System.out.print(minutes + " minutes is approxiately "
        + years + " years and "
        + (days % DAYS_IN_YEAR)
        + " days.");
        
    }
}