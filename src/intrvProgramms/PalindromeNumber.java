package intrvProgramms;

import java.util.Scanner;

//a palindrome is a sequence of characters that reads the same backward as forward.
//Examples: radar, level, madam, 12321, and A man, a plan, a canal, Panama!

 public class PalindromeNumber
 {  
	 public static void main(String args[])
	 {  
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number:");
			
			int num=sc.nextInt();
			
			int org_num=num;
			
			//1. Using Algorithm
			int rev=0;
			
			while(num!=0)
			{
			  rev=rev*10 + num%10; //(0*10 + 1234%10)=4 , (4*10 + 123%10)=43 , (43*10 + 12%10)=432 , (432*10 + 1%10)=4321
			  num=num/10; //(1234/10)=123 , (123/10)=12 , (12/10)=1 , (1/10)=0
			}
			
			if(org_num==rev)
			{
				System.out.println("It is a Palindrome Number"); 
			}
			else
			{
				System.out.println("It is a NOT a Palindrome Number");
			}
	}  
	}  