package week1.day1;

public class MobileDetails {

	public static void main(String[] args) {
		// creating object to call a method from 'Mobiles' class
		Mobiles m = new Mobiles();
		// Calling those methods of 'Mobiles' class using object
		System.out.println(m.brandName("android"));
		System.out.println(m.version(7.1f));
		// System.out.println(m.color());
		m.color(); // return type is void so can't give syso
		System.out.println(m.mobileNumber(91001380));
		System.out.println(m.doYouHaveMobile("Yes"));
	}

}
