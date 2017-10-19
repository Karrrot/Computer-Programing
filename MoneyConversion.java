import java.util.*;
import java.text.*;

//*   “I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Karan Limbachia

public class MoneyConversion {

    // Instantiate Scanner class for reading keyboard input
    public static Scanner kbd = new Scanner(System.in);

    public static void main(String[] args) {

        //Variables for keeping track of bills.
        double orgAmount;
        int orgAmount2, orgAmount3, orgAmount4,orgAmount5, orgPennies, orgP2,orgP3, orgP4;
        int twenties, tens, fives, ones;

        //variables for keeping track of coins
        int pennies, nickels, dimes, quarters;
        
        // Set up input object
        Scanner input = new Scanner(System.in);
        
        //Decimal Rounder
        DecimalFormat fmt = new DecimalFormat ("0.##");
        
        // Prompt the user to enter the number of Seconds
        System.out.println("Enter a dollar amount: ");
        orgAmount = input.nextDouble();
        
        int Org = (int)orgAmount;
        
        int orgP = (int)(orgAmount - Org) * 100;
        
        

        twenties = Org / 20;
        
        orgAmount2 = (int)Org - (twenties * 20);
        
        tens = orgAmount2 / 10;
        
        orgAmount3 = (int)orgAmount2 - (tens * 10);
        
        fives = orgAmount3 / 5;
        
        orgAmount4 = (int)orgAmount3 - (fives *5);
        
        ones = orgAmount4 / 1;
        
        quarters = orgP / 25;
        
        orgP2 = (int)orgP - (quarters * 25);
        
        dimes = orgP2 / 10;
        
        System.out.println(twenties +" Twenties");
        System.out.println(tens + " Tens");
        System.out.println(fives + " Fives");
        System.out.println(ones + " Ones");
        System.out.println(fmt.format(orgP));
        System.out.println(quarters);
        System.out.println(dimes);
    }

}


//I could not get the cents part working for the life of me, anytime iadded a decimal into the scanner input it just 
//gave errors, so i couldnt get past that point, to even start grabbing the dang number
//






/*

Converting Money

Write a program that prompts the user for a double value that represents a monetary amount. The program should then determine the fewest number of each bill and coin needed to represent that amount, starting with the highest bill (assume that a twenty dollar bill is the maximum size needed).

You should include the following:

The Scanner class to read input from the user
Variables to store:
All the bills: twenties, tens, fives and ones (all calculated)
All the coins: quarters, dimes, nickels and pennies (all calculated)
Comments as necessary
 

A sample of the output is shown below:

Enter monetary amount: 136.91
That's equivalent to:
6 twenty dollar bills
1 ten dollar bills
1 five dollar bills
1 one dollar bills
3 quarters
1 dimes
1 nickels
1 pennies
*/