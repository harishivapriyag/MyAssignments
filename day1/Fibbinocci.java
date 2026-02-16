// Print Fibbinocci series for first 11 numbers
// 0 1 1 2 3 5 8 13 21 34 55 89 144
// Goal is to understand the arithmatic operations and loop

package week1.day1;

// Create class as Fibinocci
public class Fibbinocci {

	public static void main(String[] args) {
		// initialize 3 int variables
		int firstNum = 0, secNum = 1, sum = 0;

		// To print the first number
		System.out.println(firstNum);

		// To print the second number
		System.out.println(secNum);

		// To Iterate from 1 to the 11
		for (int i = 1; i < 11; i++) {

			// Add first and second number and assign it to sum
			sum = firstNum + secNum;

			// Assign second number to the first number
			firstNum = secNum;

			// Assign sum to the second number
			secNum = sum;

			// Print sum
			System.out.println(sum);

		}
	}

}
