package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String name = "harishivapriya";
		// To reverse it, use this code also for Palindrome
		// String name = "MADAM";
		// step 1 : convert this string to charArray
		char[] charArray = name.toCharArray();

		// step 2 : for loop for going through the loop of characters in backward
		for (int i = charArray.length - 1; i >= 0; i--) {
			// for (int i = charArray.length-0; i>=0 ; i--)
			// System.out.print(charArray[i]);
			System.out.println(charArray[i]);
		}

	}
}
