package week1.day2;

public class PrimeOrNot {

	public static void main(String[] args) {

		int n=5;
		boolean bPrime=true;
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
				System.out.println(n+" is not a Prime!");
				bPrime=false;
				break;
			}
		}
		if(bPrime) {
			System.out.println(n+" is a Prime!");
		}

	}

}
