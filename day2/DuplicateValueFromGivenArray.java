package week1.day2;

import java.util.Arrays;


public class DuplicateValueFromGivenArray {

	public static void main(String[] args) {
		int[] numbs= {2,5,7,7,5,9,2,3};
		//sort the given array
		Arrays.sort(numbs); // {2,2,3,5,5,7,7,9}
		for (int i = 0; i < numbs.length-1; i++) {
			if (numbs[i]==numbs[i+1]) {
				System.out.println("Duplicate Numbers are " +numbs[i]);

			}

		}
	}

}
