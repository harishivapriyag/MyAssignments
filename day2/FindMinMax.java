package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		int[] nums = { 25, 31, 1, 99, 7, 19 }; // Find the min --> 1, max --> 99
		// to find the length of an array
		// Java is a '0' based index, so it's always starts from zero
		System.out.println(nums.length);
		Arrays.sort(nums); // Built in method to sort an array
		System.out.println(nums[3]);
		// to find the minimum value of the array
		System.out.println(nums[0]);
		// to find the maximum value of the array
		System.out.println(nums[nums.length - 1]);
	}

}
