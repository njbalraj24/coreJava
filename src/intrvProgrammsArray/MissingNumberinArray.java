package intrvProgrammsArray;

public class MissingNumberinArray {

	public static void main(String[] args) 
	{
		//Array should not have duplicates
		//Values should be in range
		//Array no need to be in sorted order
		int a[]= {1,2,4,5,};
		
		int sum1=0;
		for(int i=0; i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Some of Elements in array: "+sum1);
		
		int sum2=0;
		for(int i=1; i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Some of RANGE of Elements: "+sum2);
		
		System.out.println("Missing Element in array is: "+(sum2-sum1));
	}
}
