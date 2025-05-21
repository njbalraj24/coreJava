package intrvProgramms;

public class ReverseString 
{
	public static void main(String[] args) {
		
		//1. Using + (string concatenation operator)
		String str="ABCD";
		String rev="";
		
		int length=str.length();
		
		for(int i=length-1;i>=0;i--) //3 2 1 0
		{
			rev=rev+str.charAt(i); //D C B A
		}
		System.out.println("Reversed String is: "+rev);
		
		//2. Using StringBuffer Class
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}
}
