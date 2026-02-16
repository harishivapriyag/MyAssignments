package week1.day2;

public class WordsCount {

	public static void main(String[] args) {

		String cname = "Amazon Development Center, Chennai";
// Reverse the words only with lower case
// "chennai center, development amazon"
//To convert the words into lowercase!
		String lowerCase = cname.toLowerCase();
		System.out.println(lowerCase);

//Split into words using whitespace
		String[] words = lowerCase.split(" ");

//To print the words using reverse for loop		
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");

		}
	}

}
