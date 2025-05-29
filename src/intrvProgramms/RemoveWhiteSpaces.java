package intrvProgramms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) 
	{
		String str="Java is a  Programming  language and it is   Popular";
		
		str=str.replaceAll("\\s", ""); // here "\\s" refers to spaces
		System.out.println(str);

	}

}
