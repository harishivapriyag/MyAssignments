package week1.day2;

public class PrintNumbsOnly {

	public static void main(String[] args) {
		String input = "abc123xyz45@9";
		String num = input.replaceAll("[^0-9]", "");
		System.out.println(num);

	}

}
