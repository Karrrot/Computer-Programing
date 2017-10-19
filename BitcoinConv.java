import java.util.Scanner;
import javax.swing.JOptionPane;

//*   “I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Karan Limbachia

public class BitcoinConv{
    public static void main (String[] args) {
        // Declared constants
        final double Bitcoin = 3758.95;
        
        // Declared variable
        double USdollar, bitcoinamount;
        
        String  inputstring;
        String  name;
        
        name = JOptionPane.showInputDialog("What is your name: ");
        
        // Display results
        inputstring = JOptionPane.showInputDialog("The rate used for this calculation is"
        + "\n   1 Bitcoin is equivalent to" + Bitcoin +"."
        + "\nThe rate was recorded on 09/15/17 @ 7:00pm."
        + "\n"
        + "\n");
        
        /*
        // Set up input object
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the number of US Dollar
        System.out.print("Enter a US dollar amount w/o $: ");
        USdollar = input.nextLong();
        
        // Calculate the number of Bitcoins
        bitcoinamount = USdollar/Bitcoin;
        
        //Dispay End Results
        System.out.print(USdollar + " US dollar is approxiately "
        + "\n" + bitcoinamount + " bitcoins. ");
        */
        System.exit(0);
    }
}