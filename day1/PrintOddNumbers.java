package week1.day1;

public class PrintOddNumbers {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			i++; //increment i again so that only next number will be printed, skipping the even next number
		}
	}

}
