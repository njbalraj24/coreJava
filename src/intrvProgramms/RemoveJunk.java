package intrvProgramms;

public class RemoveJunk {

	public static void main(String[] args) 
	{
	  String s="balu%^&*( NJ #$%:; 24 Perfect";
	  
	  s=s.replaceAll("[^a-zA-Z0-9]", ""); // (^ -> other than 'a-zA-Z0-9' what all the remaining values replace those with nothing)
	  System.out.println(s);
	}

}
