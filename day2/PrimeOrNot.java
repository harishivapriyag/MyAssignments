package week1.day2;

public class PrimeOrNot {

	public static void main(String[] args) {

		int n = 9;
		boolean bPrime = true;
		// Iterate through all the numbers from 2 to n-1 (input)
		for (int i = 2; i < n; i++) {
			// for every number check it divides n (input)
			if (n % i == 0) {
				System.out.println(n + " is not a Prime!");
				bPrime = false;
				break;
			}
		}
		if (bPrime) {
			System.out.println(n + " is a Prime!");
		}

	}

}
