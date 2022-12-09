package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String name="harishivapriya"; // To reverse it
		// convert this string to charArray
		char[] charArray = name.toCharArray();
		for (int i = charArray.length-1; i>=0 ; i--) { // for (int i = charArray.length-0; i>=0 ; i--)
			System.out.print(charArray[i]); //System.out.println(charArray[i]);


		}
	}

}
