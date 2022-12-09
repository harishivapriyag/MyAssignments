package week1.day2;
import java.util.Arrays;
public class FindMinMax {

	public static void main(String[] args) {
		int[] nums= {25,31,1,99,7,19}; //Find the min --> 1, max --> 99		
		Arrays.sort(nums); //Built in method to sort an array
		System.out.println(nums[3]);
		System.out.println(nums[nums.length-1]);
	}

}
