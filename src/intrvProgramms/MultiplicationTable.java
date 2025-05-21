package intrvProgramms;

public class MultiplicationTable 
{    
public static void main(String[] args) 
{    
    int i=1;  
    //outer while loop  
    while(i<=10){    
        //inner while loop  
        int j=1;  
        while(j<=10)
        {  
            System.out.print(i*j+" ");    
            j++;    
        }    
        System.out.println();  
    i++;  
    }  
}    
}  
