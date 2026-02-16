package week1.day1;

public class Bicycle {

	// To get Bicycle Count
	public int getBicycleCount() {
		return 4;
	}

	// To get Bicycle Color
	public String getBicycleColor(String Brand) {
		return "Black";
	}

	public char getLogo() {
		return 'H';
	}

}

// syntax for creating method
//access_modifier o/p__type methodName(parameter a, parameter b)
// { return  o/p value }
// public int add(int a, int b)
//{	
//   return "a+b"
//}

// Create an object to call a method
// Syntax
// ClassName object = new ClassName();
//Calling a method
// object.methodName();