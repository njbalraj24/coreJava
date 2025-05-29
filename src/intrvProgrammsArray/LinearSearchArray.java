package intrvProgrammsArray;

public class LinearSearchArray {

	public static void main(String[] args) 
	{
	  int a[]= {10,20,30,50,40};
	  
	  int search_ele=50;
	  
	  boolean flag=false;
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]==search_ele)
		  {
			  System.out.println("Search index is: "+i);
			  flag=true;
		  }
	  }
	  
	  if(flag==false)
	  {
		  System.out.println("Not found");
	  }

	}

}
