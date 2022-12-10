package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenSalesForceinEdge {

	public static void main(String[] args) {
		// To open salesforce web page using edge browser
		EdgeDriver edriver=new EdgeDriver();
		edriver.get("https://login.salesforce.com/");
		WebElement UserName = edriver.findElement(By.name("username"));
		UserName.sendKeys("hari.radhakrishnan@qeagle.com");
		WebElement Password = edriver.findElement(By.id("password"));
		Password.sendKeys("Testleaf$321");
		WebElement Log_in = edriver.findElement(By.id("Login"));
		Log_in.click();

	}

}
