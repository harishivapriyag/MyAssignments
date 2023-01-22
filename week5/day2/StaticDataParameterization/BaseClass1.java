package week5.day2.StaticDataParameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class BaseClass1 {
	public ChromeDriver driver; // declare variable globally to access by all methods of the class
	@Parameters({"url", "username", "password"})
	@BeforeMethod //pre condition
	public void beforeMethod(String url, String name, String pwd) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url); //http://leaftaps.com/opentaps/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(name); //Demosalesmanager
		driver.findElement(By.id("password")).sendKeys(pwd); //crmsfa
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@AfterMethod //post condition
	public void afterMethod() {
		driver.close();
	}

}
