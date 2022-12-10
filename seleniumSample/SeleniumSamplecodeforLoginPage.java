package seleniumSample;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSamplecodeforLoginPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//To open a browser(chrome)
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

}
