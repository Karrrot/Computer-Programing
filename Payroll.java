import java.util.*;
import java.text.*;
import java.lang.*;
//*   “I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Karan Limbachia

public class Payroll{

public static void main (String[] args) {
    
    // Variables storage
    String Name;
    double hrwork, hrpay, fedrate, strate;
    double grosspay, fedtax, sttax, totded, netpay;
            
    // Scanner Object
    Scanner input = new Scanner(System.in);
    
    // Number Format
    NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
    NumberFormat fmt2 = NumberFormat.getPercentInstance();
    
    // Scanner Input for Employ Rate
    System.out.print("Enter your Name: ");
    Name = input.nextLine();
    
    System.out.print("Enter your hours worked: ");
    hrwork = input.nextDouble();
    
    System.out.print("Enter your hourly pay rate: ");
    hrpay = input.nextDouble();
    
    System.out.print("Enter federal tax withholding rate (as decimal): ");
    fedrate = input.nextDouble();
    
    System.out.print("Enter state tax withholding rate (as decimal): ");
    strate = input.nextDouble();
    
    // Calculations
    grosspay = hrwork * hrpay;
    fedtax = grosspay * fedrate;
    sttax = grosspay * strate;
    totded = fedtax + sttax;
    netpay = grosspay - totded;
    
    // Goal
    System.out.println("\n"
    + "\nEmployee Name: " + Name
    + "\nHours Worked: " + hrwork
    + "\nPay Rate: " + fmt1.format(hrpay)
    + "\n"
    + "\nGross Pay: " + fmt1.format(grosspay)
    + "\nDeductions: "
    + "\n   Federal Tax @ " + fmt2.format(fedrate) + ": " + fmt1.format(fedtax)
    + "\n   State Tax @ " +fmt2.format(strate) + ": " + fmt1.format(sttax)
    + "\n   Total deduction:" + fmt1.format(totded)
    + "\n   Net Pay: " + fmt1.format(netpay)
    );
    
    
    
    } 
    
}