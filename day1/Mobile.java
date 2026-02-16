package week1.day1;

public class Mobile {
	public static void main(String[] args) {
		long phnum = 9159001380L; // The number 9159001380 exceeds the range of the int type, and Java treats
		// whole numbers as int by default. Even though you're assigning it to a long,
		// the compiler first tries to treat 9159001380 as an int literal, which causes
		// a "number too large" error.
// need to explicitly tell Java it's a long literal by appending L or l to the
// number
		char brand = 'S';
		boolean is_Android = true;
		String color = "Lavender";
		int cost = 65000;
		System.out.println(phnum);
		System.out.println(brand);
		System.out.println(is_Android);
		System.out.println(color);
		System.out.println(cost);
	}

}
