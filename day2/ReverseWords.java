package week1.day2;

public class ReverseWords {

	private static int length;

	public static void main(String[] args) {
		String name = "Amazon Development center, chennai";

		// To get the length of the string
		length = name.length();
		System.out.println(length);

		// Reverse the words only with lower case
		String lowerCase = name.toLowerCase();
		System.out.println(lowerCase);
		System.out.println("********");

		// Split the sentence by the white space -- words
		String[] words = lowerCase.split(" ");

		// To get the count of the string array
		System.out.println(words.length);

		// Reverse the words "chennai ,center Development Amazon "
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i] + " ");

		}

	}

}
