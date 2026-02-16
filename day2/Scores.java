package week1.day2;

public class Scores {
	public static void main(String[] args) {
		// Arrays will have definite size!!
		// 1- Creating array using Array literal
		// syntax 1 - type name[]={values};
		// syntax 2 - type[] name = {values};
		String subjects[] = { "Tamil", "English", "Maths", "Science", "Social Science" };
		int tenthmarks[] = { 91, 93, 94, 98, 98 }; // if the value goes beyond the array, then it will get
													// ArrayIndexOutofBoundsException

		/*
		 * System.out.println(tenthmarks[0]); System.out.println(tenthmarks[1]);
		 * System.out.println(tenthmarks[2]); System.out.println(tenthmarks[3]);
		 * System.out.println(tenthmarks[4]);
		 */

		// array length (property) will return you length or count the array items
		for (int i = 0; i < tenthmarks.length; i++) {
			System.out.println(subjects[i] + ":");
			System.out.println(tenthmarks[i]);	
		}
		// 2 - Creating array using Instantiation
		// syntax - type[] name=new type[size];
		int[] marks = new int[5];
		marks[0] = 91;
		marks[1] = 93;
		marks[2] = 94;
		marks[3] = 98;
		marks[4] = 98;
		System.out.println(marks[0]);
		String[] mentors = new String[4];
		System.out.println(mentors[0]);
// for integer --> default value is 0 when values are not assigned and only array is defined.
// for string default value is'null' when values are not assigned and only array is defined.
	}
}
