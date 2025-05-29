package intrvProgramms;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		
		String s="Java Programming Java oops";
		
		int total_count=s.length();
		
		int total_countafterreplace=s.replace("a", "").length();
		
		int count = total_count - total_countafterreplace;
		
		System.out.println("Number of occurence is: "+count);
	}

}
