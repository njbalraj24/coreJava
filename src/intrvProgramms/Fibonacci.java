package intrvProgramms;

//The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones.

//In other words, in the Fibonacci series, the next number is the sum of the previous two numbers. It usually starts with 0 and 1.
//The sequence goes like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, and so on.

public class Fibonacci 
{    
public static void main(String args[])    
 {      
 int n1=0,n2=1,n3,i,count=10;      
 System.out.print(n1+" "+n2);  //printing 0 and 1      
 for(i=2;i<count;++i)   //loop starts from 2 because 0 and 1 are already printed      
 {      
  n3=n1+n2;      
  System.out.print(" "+n3);      
  n1=n2;      
  n2=n3;      
 }      
}  
}    
