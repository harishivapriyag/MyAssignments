package week1.day2;

public class WordReverse {

	public static void main(String[] args) {
		String str = "Automation Testing : Java, Selenium, Python";
		int length = str.length();
		System.out.println(length);
		// To split the words in a string by white space, we use 'split()' method
		String[] words = str.split(" ");
		// To get the count of the words
		System.out.println(words.length);
		// To reverse the entire string by words with lowercase
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i].toLowerCase() + " ");
		}

	}

}
