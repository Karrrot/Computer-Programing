import java.util.*;
import java.text.*;
import java.lang.*;

//*   “I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Karan Limbachia

public class testfile{
    
    public static int sum (int i1, int i2){
        
        int result = 0;
            for (int i = i1; i <= i2; i++)
            result += i;
            
            return result;
    }
    
    public static void main (String[] args) {
        System.out.println(sum(1, 5));
    }
    
}