package week1.day1;

public class OddNumberReverseFor {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 1) {
				System.out.println("Odd numbers are " + i);
			}

		}
		System.out.println("*********************");
		for (int j = 20; j >= 1; j--) {
			if (j % 2 == 1) {
				System.out.println("Reversed odd numbers are " + j);
			}

		}
	}
}
