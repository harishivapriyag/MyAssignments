package week1.day1;

public class PrintBicycleInformation {

	public static void main(String[] args) {
		// How to access Bicycle class and it's methods?

		// 1. Create an object
		// ClassName object = new ClassName();
		Bicycle cycle = new Bicycle();

		// How to call a method?
		// object.methodName();
		System.out.println(cycle.getBicycleCount());
		System.out.println(cycle.getBicycleColor("Brand"));

	}

}
