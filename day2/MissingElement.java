package week1.day2;

import java.util.Scanner;

public class MissingElement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n; //Declare array size
		System.out.println("Enter the total numbers of elements: ");
		n=sc.nextInt(); //Initialize array size
		int[] arr=new int[n];
		System.out.println("Enter the elements the array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int sum=(n+1)*(n+2)/2; //Calculate the expected sum of all the elements
		for (int i = 0; i < arr.length; i++) {
			sum=sum-arr[i]; //Subtract each element from sum
		}
		System.out.println("Missing Element is:" +sum); //Print the Missing Element
	}

}
