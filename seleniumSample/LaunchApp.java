package seleniumSample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchApp {

	public static void main(String[] args) {
		ChromeDriver chrdriver=new ChromeDriver();
		chrdriver.get("https://www.facebook.com/");
		EdgeDriver edriver=new EdgeDriver();
		edriver.get("https://www.facebook.com/");
	}
}
