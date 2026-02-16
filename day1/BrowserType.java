package week1.day1;

public class BrowserType {
	public static void main(String[] args) {
		String browser = "chrome";
		System.out.println(browser);
		switch (browser) {
		case "chrome":
			System.out.println("This is from Google");
			break;
		case "edge":
			System.out.println("This is from Microsoft");
			break;
		case "safari":
			System.out.println("This is from Apple");
			break;
		case "firefox":
			System.out.println("This is from Mozilla");
			break;

		}
	}

	//switch case only supports int, string datatypes and java version above 1.7
}
