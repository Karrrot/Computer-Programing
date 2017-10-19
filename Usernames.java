import java.util.*;
import java.text.*;

//*   “I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Karan Limbachia

public class Usernames{

public static void main (String[] args) {
    
    String firstname, lastname, username;
    
    // Scanner Object
    Scanner input = new Scanner(System.in);
    
    // Random # Generator
    Random rand = new Random();
    int  n = rand.nextInt(100) + 599;
    
    // Scanner Input for first name
    System.out.print("Enter your First Name: ");
    firstname = input.next();
    
    // Scanner Input for last name
    System.out.print("Enter your Last Name: ");
    lastname = input.next();
    
    // Extracts 1st letter from Firsname, and first 3 letters from Lastname
    char ch1 = firstname.charAt(0);
    char ch4 = lastname.charAt(0);
    char ch5 = lastname.charAt(1);
    char ch6 = lastname.charAt(2);
    
    // Print Out of the username
    System.out.println("Username: " + ch1 + ch4 + ch5 + ch6 + n);
    
    
    }
    
    
    
    
    
    
}