package intrvProgrammsArray;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsinArray {

	public static void main(String[] args) 
	{
		//Approach 1
		int a[]= {30,50,20,10,40};
		
		System.out.println("Array elements before sorting: "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array elements After sorting: "+Arrays.toString(a));
		
		//Approach 2
		int b[]= {30,50,20,10,40};
		System.out.println("Array elements before sorting: "+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("Array elements After sorting: "+Arrays.toString(b));
		
		//Reverse Descending order
		Integer c[]= {30,50,20,10,40}; //here 'Integer' as to use, because collection.reverse won't work for int type
		System.out.println("Array elements before sorting: "+Arrays.toString(c));
		Arrays.sort(c,Collections.reverseOrder());
		System.out.println("Array elements After sorting: "+Arrays.toString(c));
	}

}
