package controlStatements3;

public class SwitchStm {       
    public static void main(String args[])  
    {         
         Integer age = 18;        
         switch (age)  
         {  
             case (16): System.out.println("You are under 18.");  break;  
             case (18): System.out.println("You are under 18.");  break;
             case (65): System.out.println("You are under 18.");  break; 
             default: System.out.println("Please give the valid age."); break;  
         }             
     }  
}  