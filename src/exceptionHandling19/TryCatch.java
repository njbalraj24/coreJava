package exceptionHandling19;

public class TryCatch 
{	  
    public static void main(String[] args) 
    {  
        try  
        {  
        int data=50/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}

//java.lang.ArithmeticException: / by zero
//rest of the code