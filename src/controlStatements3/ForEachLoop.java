package controlStatements3;

public class ForEachLoop 
{    
public static void main(String[] args) 
{    
    //Declaring an array    
    int arr[]={12,23,44,56,78};    
    //Printing array using for-each loop    
    for(int i:arr)
    {    
        System.out.println(i);    
    } 
}    
}  

//The enhanced for loop in Java can only iterate over arrays or objects that implement the Iterable interface.