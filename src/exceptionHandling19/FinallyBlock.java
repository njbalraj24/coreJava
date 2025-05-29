package exceptionHandling19;

/*
 Java finally block is always executed, whether an exception is handled or not.
 Therefore, it contains all the necessary statements that need to be printed regardless of whether an exception occurs or not.
 */



public class FinallyBlock 
{   
    
  public static void main(String args[])  
  {      
      try {      
    //The below code does not throw any exception    
       int data=25/5;      
       System.out.println(data);      
      }      
    //catch won't be executed    
      catch(NullPointerException e) {    
    System.out.println(e);    
    }      
    //executed regardless of exception occurred or not    
     finally {    
    System.out.println("Finally block is always executed");    
    }      
    System.out.println("rest of the code...");      
  }      
}    