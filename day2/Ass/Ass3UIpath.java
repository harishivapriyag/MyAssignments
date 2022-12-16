package week2.day2.Ass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass3UIpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		// To load the web page
		driver.get("https://acme-test.uipath.com/login");
		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		// To enter E-mail
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("kumar.testleaf@gmail.com");
		// To enter password
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("leaf@12");
		// To click login button
		WebElement login = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		login.click();
		// To get the title of the current page
		String title = driver.getTitle();
		// To print the title
		System.out.println("The title of the current page is : " +title);
		// To confirm the title ACME System
		if(title.contains("ACME System"))
		{
			System.out.println("I confirm the title has ACME System");
		}
		else
		{
			System.out.println("The title does not have the word ACME System");
		}
		Thread.sleep(3000); // To stay on that action for a second
		// To click on log out
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
		logout.click();
		Thread.sleep(3000); // To stay on that action for a second
		// To close the browser
		driver.close();
	}

}

