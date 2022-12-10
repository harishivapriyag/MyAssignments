package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSalesForce {

	public static void main(String[] args) {
		// To open web browser
		ChromeDriver chrdriver=new ChromeDriver();
		chrdriver.get("https://login.salesforce.com/");
		WebElement Username = chrdriver.findElement(By.id("username"));
		Username.sendKeys("hari.radhakrishnan@qeagle.com");
		WebElement Password = chrdriver.findElement(By.name("pw"));
		Password.sendKeys("Testleaf$321");
		WebElement Login = chrdriver.findElement(By.id("Login"));
		Login.click(); 
	}

}
