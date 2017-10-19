import java.util.*;
import java.text.*;
import java.lang.*;

//*   “I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Karan Limbachia

public class Intersect{
    
    public static void main (String[] args) {
    
    // Variables
    double a, b, c, d, e, f, x, y, x1, x2, x3, x4, y1, y2, y3, y4;
    
    // Scanner Object
    Scanner input = new Scanner(System.in);
        
    // BigDecimalFormat
    DecimalFormat fmt = new DecimalFormat("#.##");
    DecimalFormat fmt1 = new DecimalFormat("#");
    
    //First Part of Output statement
    System.out.println("This program gets the coordinates of two lines,"
        + "\ncalculates and displays the equations of the lines,"
        + "\nthen calculates and displays the intersection of the"
        + "\nline if it exists."
        + "\n");
        
    System.out.println("First, enter the coordinates of line 1 (i.e. x1, y1, x2, y2): ");
    
        x1 = input.nextDouble();
        y1 = input.nextDouble(); 
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        
    System.out.println("Now, enter the coordinates of line 2 (i.e. x3, y3, x4, y4): ");
    
        x3 = input.nextDouble();
        y3 = input.nextDouble(); 
        x4 = input.nextDouble();
        y4 = input.nextDouble();
    
    //Calculations 
    a = y1 - y2;
    b = -(x1 - x2);
    c = y3 - y4;
    d = -(x3 -x4);
    e = ((y1 - y2) * x1) - ((x1 - x2) * y1);
    f = ((y3 - y4) * x3) - ((x3 - x4) * y3);
    x = ((e * d) - (b * f)) / ((a * d) - (b * c));
    y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        
    // Final Output statemtn
    System.out.println("Line 1 has the points at (" 
    + x1 
    + "," 
    + y1 
    + ")" 
    + " and " 
    + "(" 
    + x2 
    + "," 
    + y2 
    + ")" );
    
    System.out.println("The Equation for line 1 is " 
    + fmt1.format(a) 
    + "x+" 
    + fmt1.format(b) 
    + "y = " 
    + fmt1.format(e));
    
    System.out.println("Line 2 has the points at (" 
    + x3 
    + "," 
    + y3 
    + ")" 
    + " and " 
    + "(" 
    + x4 
    + "," 
    + y4
    + ")" );
    
    System.out.println("The Equation for line 1 is " 
    + fmt1.format(c) 
    + "x+" 
    + fmt1.format(d) 
    + "y = " 
    + fmt1.format(f));
    
    
    if (((a * d) - (b * c)) == 0)
    System.out.println("The two lines are parallel");
    else
    System.out.println("The intersection point is at (" 
    + fmt.format(x) 
    + "," 
    + fmt.format(y) 
    + ")");

    }
    
    
}