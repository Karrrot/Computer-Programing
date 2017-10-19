import java.util.Scanner;
import java.text.*;

//*   “I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Karan Limbachia

public class SecondsConv{
    public static void main (String[] args) {
        // Declared constants
        final int SECOND_IN_HOUR = 3600;
        final int SECOND_IN_MINUTE = 60;
        
        // Declared variable
        long seconds, minutes, hours, onesec;
        
        // Set up input object
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the number of Seconds
        System.out.print("Enter the number of seconds: ");
        seconds = input.nextLong();
        
        // Calculate the number of Hours and Minutes
        hours = seconds / SECOND_IN_HOUR;
        minutes = (seconds % SECOND_IN_HOUR) / 60;
        onesec = (seconds % 60);
        
        // Display results
        System.out.print("Hours: " + hours
        + "\nMinutes: " + minutes
        + "\nSeconds: " + onesec);
        
    }
}


/**
Converting Seconds

Write a program that prompts the user for a value representing the number of seconds, then prints the equivalent number of times as a combination of hours, minutes and seconds. 

You should include the following:

The Scanner class to read input from the user
Constants to store:
The number of seconds in an hour
The number of seconds in a minute
Variables to store:
The number of seconds (obtained from the user and updated within the program)
The number of minutes (calculated)
The number of hours (calculated)
Comments as necessary 

A sample of the output is shown below:

 

Enter the number of seconds: 9999
Hours: 2
Minutes: 46
Seconds: 39
*/
