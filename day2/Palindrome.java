package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String name = "deed"; // case sensitive so Deed is different
		char[] charArray = name.toCharArray();
		String reverseStr = "";
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.println(charArray[i]);
			reverseStr = reverseStr + charArray[i];
		}
		System.out.println(reverseStr + " is a Palindrome!");
		if (name.equals(reverseStr)) // To compare two strings, we use .equals() method
		{
			System.out.println("Both strings are same. So they are Palindrome!");
		} else {
			System.out.println("Both strings are not same. So they are not a Palindrome!");
		}

	}

}
