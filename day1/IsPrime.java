package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int a=25;
		int count=0;
		for(int i=2; i<a; i++) {
			if(a%i==0) { 
				count++;
				break;
			}
		}
			if(count==1) {
				System.out.println(a+ " is not a Prime Number");
			}
			else { 
				System.out.println(a+ " is a Prime Number");

			}
		}
	}
