package week1.day2;

public class PrintVowels {

	public static void main(String[] args) {
		String name = "Google";
		// I need to print vowels only -- 'a, e, i, o, u'
		// Break the string into characters
		// Check if the character has any vowel
		// if it is present means --> print that
		// else continue
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
					|| charArray[i] == 'u') {
				System.out.println(charArray[i]);
			}

		}
	}

}
