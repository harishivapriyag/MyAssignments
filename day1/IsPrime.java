package week1.day1;

// Create a class by name: IsPrime

public class IsPrime {

	// Create a main method using shortcut
	public static void main(String[] args) {
		int a = 7;
		// int a = 25;
		int count = 0;

		// Iterate through all numbers from 2 to n-1 (input) and every number check if
		// it divides n (input)
		for (int i = 2; i < a; i++) {

			// If we find any number that divides, print prime.
			if (a % i == 0) {
				count++;
				break;
			}
		}

		// If nothing divides, then print non-prime
		if (count == 1) {
			System.out.println(a + " is not a Prime Number");
		} else {
			System.out.println(a + " is a Prime Number");

		}
	}
}
