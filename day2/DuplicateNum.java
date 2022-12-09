package week1.day2;

import java.util.Arrays;

public class DuplicateNum {

	public static void main(String[] args) {
		int[] numbs= {2,5,7,7,5,9,2,3};
		//sort the given array
		Arrays.sort(numbs); // {2,2,3,5,5,7,7,9}
		// loop through the number (inner loop)
		for(int i=0; i<numbs.length; i++) {
			// loop through the next number (outer loop)
			for(int j=i+1; j<numbs.length; j++) {
				// compare both numbers
				if(numbs[i]==numbs[j]) {
					// print the values
					System.out.println(numbs[i]);
					System.out.println(numbs[j]);
					System.out.println("Duplicate Numbers are " + numbs[i] + " and " + numbs[j]);}
			}
		}

	}

}
