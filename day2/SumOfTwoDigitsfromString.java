package week1.day2;

public class SumOfTwoDigitsfromString {

	public static void main(String[] args) {
		int[] n= {7,16,25,9,1,6,20,5}; 
		int target =25; //find out the numbers that reaches target
		// loop through a number (outer loop)
		for (int i = 0; i < n.length; i++) {
			// loop through a number (inner loop)
			for (int j = i+1; j < n.length; j++) // j=i 
			{//add the both numbers for comparing with the target value 
				if (n[i]+n[j]==target) {
					System.out.println("Sum of " +n[i]+ " & " +n[j]+ " are the values to get the target " +target);
					break;
				}

			}

		}


	}

}
