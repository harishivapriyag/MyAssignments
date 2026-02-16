package week1.day2;

public class CharacterCount {

	public static void main(String[] args) {
		String company = "hexaware";
		int count = 0;
		// char c='e';
		// 1.toCharArray 2. Loop through 3. Check if the letter is present 3. print
		// count
		// Break the string into characters
		// Traverse to each character and compare the expected
		// if it is matching, count them
		// else continue!!

		char[] charArray = company.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'e') {
				count++;
			}
		}
		{
			System.out.println(count);
		}
		// String name="hexaware";
		// char c='e';
		// output=2
	}

}
