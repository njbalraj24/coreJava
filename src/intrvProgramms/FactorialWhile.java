package intrvProgramms;

public class FactorialWhile {    
    public static void main(String[] args) 
    {        
        int number = 5;    
        // Declare a variable 'factorial' and initialize it to 1. This variable will hold the result of the factorial calculation.    
        int factorial = 1;    
        // Declare a variable 'i' and initialize it to 1.    
        int i = 1;  
        //Start a while loop   
        while( i <= number ) 
        {    
            // Multiply the current value of 'factorial' by 'i' and store the result back in 'factorial'.    
            factorial *= i; // This is equivalent to factorial = factorial * i;   
            i++;  
        }    
        // Print the calculated factorial to the console.    
        System.out.println("Factorial of " + number + " is: " + factorial);    
    }    
}    
