package string15;

public class StringComparisonUsingComapreto 
{  
    public static void main(String[] args)
    {  
        String str1 = "Sachin";  
         String str2 = "Sachin";  
         String str3 = "Ratan";  
         System.out.println(str1.compareTo(str2));      // 0  
         System.out.println(str1.compareTo(str3));      // 1 (str1 > str3)  
         System.out.println(str3.compareTo(str1));      // -1 (str3 < str1)  
     }  
 }  
