package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		String name = "Test Leaf"; // Test Leaf=9, TestLeaf=8

		// To find the number of the characters in the given string
		int length = name.length();
		// length() is a method, so it can be changed during runtime
		// array length is fixed yet it cannot be changed during runtime, hence it is a
		// property or variable

		// To print the length of the given string
		System.out.println(length);

		// To convert the string into characters
		char[] charArray = name.toCharArray();

		// To print the characters
		System.out.println(charArray[0]);

		// To print the every characters
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);

			// To check whether 'L' is present
			if (charArray[i] == 'L') {
				System.out.println(charArray[i] + " is Present!");
			}
		}

		// To check whether the character(s) exist or not
		if (name.contains("s") || name.contains("i")) // 'contains' is case sensitive & checks for characters, also
														// words
		{
			System.out.println("Present!");
		} else {
			System.out.println("Not Present!");
		}
	}
}
