package week1.day2;

public class CharactersCount {
	public static void main(String[] args) {
		String CompanyName = "Harness Digitech";
		int count = 0;
		char expected = 'i';
		// To print how many times the expected character is present!
		// Break the string into characters
		// Traverse to each character and compare with the expected
		// if it is matches, print it and count it
		// else continue
		char[] charArray = CompanyName.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == expected) {
				count++; // increase the count of expected if it is meets the condition
			}
		}
		System.out.println(count);
	}
}
