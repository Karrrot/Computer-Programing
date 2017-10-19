import java.util.*;
import java.text.*;
import java.lang.*;
//*   “I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Karan Limbachia

public class Heron{
    public static void main (String[] args) {
            
    // Scanner Object
    Scanner input = new Scanner(System.in);
    
    // BigDecimalFormat
    DecimalFormat fmt = new DecimalFormat("#.###");
    
    double a, b, c, s, area;
    
    // Scanner Input for 
    System.out.print("Enter your First Side: ");
    a = input.nextDouble();
    
    // Scanner Input for 
    System.out.print("Enter your Second Side: ");
    b = input.nextDouble();
    
    // Scanner Input for 
    System.out.print("Enter your Third Side: ");
    c = input.nextDouble();
    
    s = (a + b + c) / 2;
    
    area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    
    System.out.println(fmt.format(area));
    
    
    }
}