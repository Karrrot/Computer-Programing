public class NautMile {
    
    //“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Karan Limbachia
    
    public static void main (String[] args) {
        //Variable -- HardCoded NautMile Number
        double NautMile;
        NautMile = 363;
        
        //constant -- Number of Kilometers in a NautMile
        double km;
        km = 1.852;
        
        //Constant -- Number of Miles in a NautMile
        double ml;
        ml = 1.150779;
        
        //Calcuated Variable -- Calcuated Kilometers in a NautMile using HardCoded Number
        double knm;
        knm = NautMile * km; 
        
        //Calculated Variable -- Calcuated Miles in a NautMile using HardCoded Number
        double mnm;
        mnm = NautMile * ml;
        
        //Print output -- Goal of the Program
        System.out.println(NautMile + " Nautica miles is equivalent to"
        + "\n" + knm + " Kilometers or " + mnm + " Miles");
    }
    
    
}