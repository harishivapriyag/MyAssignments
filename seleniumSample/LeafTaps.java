package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTaps {

	public static void main(String[] args) {
		ChromeDriver chrdriver=new ChromeDriver();
		chrdriver.get("http://leaftaps.com/opentaps");
		WebElement Username = chrdriver.findElement(By.id("username"));
		Username.sendKeys("Demosalesmanager");
		WebElement Password = chrdriver.findElement(By.name("PASSWORD"));
		Password.sendKeys("crmsfa");
		WebElement Login = chrdriver.findElement(By.className("decorativeSubmit"));
		Login.click();
	}

}
