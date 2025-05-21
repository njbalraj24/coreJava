package javaOperators;

 
public class DecrementOpr {
    public static void main(String args[]) 
    {
        int x = 10;
        System.out.println(x--);  // prints 10
        System.out.println(--x);  // prints 8
    }
}

/*  
     *********Explanation:*********
     1. int x = 10;                                
     We initialize x with the value 10.            
                                                   
     2. System.out.println(x--);                   
     This uses the post-decrement operator (x--).  
                                                   
     Meaning:                                      
                                                   
     First, the current value of x (10) is printed.
                                                   
     Then, x is decremented by 1 → x becomes 9.    
                                                   
     Output: 10                                    
                                                   
     3. System.out.println(--x);                   
     This uses the pre-decrement operator (--x).   
                                                   
     Meaning:                                      
                                                   
     First, x is decremented by 1 → x becomes 8.   
                                                   
     Then, the new value (8) is printed.           
                                                   
*/ 