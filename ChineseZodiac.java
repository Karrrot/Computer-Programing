import java.util.*;
import java.text.*;
import java.lang.*;

//*   “I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Karan Limbachia

public class ChineseZodiac{

    public static void main (String[] args) {
        
    // Variables
    int year, zodiac;
        
    // Scanner Object
    Scanner input = new Scanner(System.in);
    
    // Scanner Input for 
    System.out.print("Enter a year: ");
    year = input.nextInt();
    
    // Input Validator
    while (year <= 0){
        System.out.println("Enter anno domini (AD) years please!");
        System.out.print("Re-enter the year: ");
        year = input.nextInt();
        
        }

    while (year < 1883 || year > 2017){
        System.out.println("Sorry, that year is not within the valid range. (1883-2017)");
        System.out.print("Re-enter the year: ");
        year = input.nextInt();
        
        }
        
    // Calculation
    zodiac = year % 12;
    
    // Final Output -- W/ Switch
    System.out.print("The year " + year + " is the year of the ");
    
    switch (zodiac){
        case 11:
            System.out.println("Sheep");
            break;
        case 10:
            System.out.println("Horse");
            break;
        case 9:
            System.out.println("Snake");
            break;
        case 8:
            System.out.println("Dragon");
            break;
        case 7:
            System.out.println("Rabbit");
            break;
        case 6:
            System.out.println("Tiger");
            break;
        case 5:
            System.out.println("Ox");
            break;
        case 4:
            System.out.println("Rat");
            break;
        case 3:
            System.out.println("Pig");
            break;
        case 2:
            System.out.println("Dog");
            break;
        case 1:
            System.out.println("Rooster");
            break;
        case 0:
            System.out.println("Monkey");
            break;
        }

    }
    
}
