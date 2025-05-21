package intrvProgramms;

//The factorial of a number is the product of all positive integers from 1 up to that number. For example, 
//5! (5 factorial) is 5 * 4 * 3 * 2 * 1 = 120

public class FactorialNumber 
{    
    public static void main(String[] args) 
    {    
           
        int number = 5;    
            
        int factorial = 1;       
        for (int i = 1; i <= number; i++) 
        {    
            // Multiply the current value of 'factorial' by 'i' and store the result back in 'factorial'.    
            factorial = factorial * i; 
        }    
        // After the loop has completed, print the calculated factorial to the console.    
        System.out.println("Factorial of " + number + " is: " + factorial);    
    }    
}    
