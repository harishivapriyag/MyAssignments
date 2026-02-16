package week1.day2;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "deeds"; // deer for not a Palindrome
		// 'Deed' is not a palindrome .i.e. java is case sensitive!!
		// str = str.toLowerCase();
		// using 'reverseStr' keyword

		String reverseStr = "";
		int strLength = str.length();

		for (int i = (strLength - 1); i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}

		// To compare two strings, we use '.equals()' method
		// we use '.equalsIgnoreCase()' to ignore the case of the string
		if (str.equalsIgnoreCase(reverseStr)) {
			System.out.println(str + " Palindrome!");
		} else {
			System.out.println(str + " Not a Palindrome!!");
		}

		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " is a Palindrome!");
		} else {
			System.out.println(str + " is not a Palindrome!");
		}
	}

}
