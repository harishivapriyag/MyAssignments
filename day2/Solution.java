package week1.day2;

public class Solution {
	static int max=26;

	public static boolean isAnagram(String input1, String input2) {
		int l1=input1.length();
		int l2=input2.length();

		// If the length is not same to print as "False"
		if(l1!=l2)
		{
			return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		String input1="stop"; //java
		String input2="post"; //selenium
		if(isAnagram(input1,input2))
			System.out.println("true");
		else
			System.out.println("false");

	}

}



