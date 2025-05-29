package intrvProgrammsArray;

import java.util.Arrays;

public class ArraysEquals {

	public static void main(String[] args) 
	{
		int a1[]= {1,2,3,4,5,6};
		int a2[]= {1,2,3,4,5,6};
		
		//Approach 1
		boolean status=Arrays.equals(a1, a2);
		if(status==true)
		{
			System.out.println("Arrays are Equal");
		}
		else
		{
			System.out.println("Arrays are NOT Equal");
		}
		
		//Approach 2
		boolean status1=true;
		if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
				{
					status1=false;
				}
			}
		}
		else
		{
			status1=false;
		}
		
		if(status1==true)
		{
			System.out.println("Arrays are Equal");
		}
		else
		{
			System.out.println("Arrays are NOT Equal");
		}
	}

}
