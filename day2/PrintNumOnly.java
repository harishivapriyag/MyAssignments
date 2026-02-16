package week1.day2;

public class PrintNumOnly {

	public static void main(String[] args) {
		String details = "Amazon has 11400 employees in chennai";
		// Print the numbers only from here!!
		// To split the string into single characters
		char[] charArray = details.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			// To print the numbers only using ASCII VALUES of the numbers
			if (charArray[i] >= 48 && charArray[i] <= 57) {
				// if you use println, it will take you to the next line instead use print for
				// printing the output on the same line
				System.out.print(charArray[i]);
			}

		}
	}

}
