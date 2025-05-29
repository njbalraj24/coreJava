package intrvProgrammsArray;

public class SumofArray {

	public static void main(String[] args) 
	{
		//Approach 1
		int a[]= {2,4,3,5,7};
		
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of an Array is: "+sum);
		
		//Approach 2
		int sum1=0;
		for(int value:a)
		{
			sum1=sum1+value;
		}
		System.out.println("Sum of an Array is: "+sum1);
	}

}
