package intrvProgramms;

public class SwapTwoNumbers 
{
	public static void main(String[]args)
	{
		//Approach1: Using temporary variable
		int a1=10; int b1=20;
		System.out.println("Before Swapping "+a1+" "+b1);
		
		int t1;
		
		t1=a1; a1=b1; b1=t1;
		
		System.out.println("After Swapping "+a1+" "+b1);
		
		//Approach2: Using + and -
		int a2=2; int b2=4;
		System.out.println("Before Swapping "+a2+" "+b2);
		
		a2=a2+b2; //6
		
		b2=a2-b2; //6-4 = 2
		a2=a2-b2; //6-2 = 4
		System.out.println("After Swapping "+a2+" "+b2);
		
		//Approach2: Using * and / --> Like above we can achieve.
	}
}
