package intrvProgramms;

public class CountEvenOddNumbers {

	public static void main(String[] args) 
	{
		int num=1234;
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
		num=num/10;
		}
		System.out.println("Count of Even numbers: "+even_count);
		System.out.println("Count of Odd numbers: "+odd_count);
	}
}
//Count of Even numbers: 2
//Count of Odd numbers: 2
