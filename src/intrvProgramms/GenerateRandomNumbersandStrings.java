package intrvProgramms;

import java.util.Random;

public class GenerateRandomNumbersandStrings {

	public static void main(String[] args) 
	{
		//Approach 1 - RANDOM
		Random random=new Random();
		int rand_int=random.nextInt(100);
		System.out.println(rand_int);
		
		//Approach 2 - MATH
		System.out.println(Math.random()); //gives fraction numbers
		
		//Using 3rd Party Library we can generate
		//RandomStringUtils.randomNumeric(5) --> Generates 5 digit number
		//RandomStringUtils.randomString(8) --> Generates 8 digit alphabet

	}

}
