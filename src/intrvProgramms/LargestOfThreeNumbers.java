package intrvProgramms;

public class LargestOfThreeNumbers {

	public static void main(String[] args) 
	{
	  //Approach1
	  int a=40, b=50, c=60;
	  
	  if(a>b && a>c)
	  {
		  System.out.println("a is greater");
	  }
	  else if(b>a && b>c)
	  {
		  System.out.println("b is greater");
	  }
	  else
	  {
		  System.out.println("c is greater");
	  }
	  
	  
	  //Approach2
	  int d=20, e=40 , f=50;
	  
	  int largest1=d>e?d:e;
	  int largest2=f>largest1?f:largest1;
	  
	  System.out.println(largest2);

	}
}
