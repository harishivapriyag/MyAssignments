package week1.day2;

public class ReverseWords {

	public static void main(String[] args) {
		String name=" Amazon Development center, chennai";
		//Split the sentence by the white space -- words
	String[] words = name.split(" ");
	
	//Reverse the words "chennai ,center Development Amazon "
	for (int i = words.length-1; i>=0; i--) {
		System.out.print(words[i].toLowerCase() + " ");
		
	}
	
	}

}
