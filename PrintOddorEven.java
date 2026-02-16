package week1.day1;

//To print odd or even from number one to twenty
public class PrintOddorEven {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("The number " + i + " is even number");
			} else {
				System.out.println("The number " + i + " is odd number");
			}
		}
	}

}
