package intrvProgrammsArray;

public class DuplicatesValuesinArray {

	public static void main(String[] args) 
	{
	  String arr[]= {"Java","C","C++","Java","Python","C"};
	  
	  boolean flag=false;
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[i]==arr[j])
			  {
				  System.out.println("Duplicate entries found: "+arr[i]);
				  flag=true;
			  }
		  }
	  }
	  
	  if(flag==false)
	  {
	  System.out.println("Duplicate entries NOT found");
	  }

	}

}
