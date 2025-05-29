package string15;

public class StringComparisonUsingequalsIgnoreCase 
{  
    public static void main(String[] args) 
    {  
        String s1 = "Ram";  
        String s2 = "rAm";  
        // Using equals() method for case-sensitive comparison  
        boolean equalsResult = s1.equals(s2);  
        System.out.println("Using equals() method: " + equalsResult); // Output: false  
        // Using equalsIgnoreCase() method for case-insensitive comparison  
        boolean equalsIgnoreCaseResult = s1.equalsIgnoreCase(s2);  
        System.out.println("Using equalsIgnoreCase() method: " + equalsIgnoreCaseResult); // Output: true  
    }  
}  
