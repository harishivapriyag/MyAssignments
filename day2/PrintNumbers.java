package week1.day2;

public class PrintNumbers {

	public static void main(String[] args) {
		String details="Amazon has 11400 employees in chennai"; //Print the numbers only from here!!
		String numbs=details.replaceAll("[^0-9]",""); // To exclude the characters and spaces except numbers
		//To split as single characters
		//char[] charArray = details.toCharArray(); 
		{
			//To print only the numbers
			System.out.println(numbs); 
			//To display only the characters
			//System.out.println(details.replaceAll(numbs,"")); 
			//System.out.println(charArray);
		}


	}

}
