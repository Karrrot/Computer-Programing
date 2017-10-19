import java.util.*;
import java.text.*;
import java.lang.*;
//*   “I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Karan Limbachia

public class Generation{

    public static void main (String[] args) {
        
    // Variables
    int year;
        
    // Scanner Object
    Scanner input = new Scanner(System.in);
    
    // Scanner Input for 
    System.out.print("Enter a year: ");
    year = input.nextInt();
    
    // Input Validator
    while (year < 1883 || year > 2017){
        System.out.println("Sorry, that year is not within the valid range.");
        System.out.print("Re-enter the year: ");
        year = input.nextInt();
        
        }

    // If else if statment -- Final Output 
    if (year >= 1883 && year <= 1900)    
        System.out.println("You are part of The Lost Generation");
        else if (year >= 1901 && year <= 1924)
        System.out.println("You are part of GI Generation");
        else if (year >= 1925 && year <= 1945)
        System.out.println("You are part of Silent Generation");
        else if (year >= 1946 && year <= 1964)
        System.out.println("You are part of Baby Boomers");
        else if (year >= 1965 && year <= 1984)
        System.out.println("You are part of Generation X");
        else if (year >= 1985 && year <= 2004)
        System.out.println("You are part of The Millennial");
        else if (year >= 2005 && year <= 2017)
        System.out.println("You are part of Generation Z");
    
    
    }
}
