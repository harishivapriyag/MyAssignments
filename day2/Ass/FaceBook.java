package week2.day2.Ass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver chrdriver=new ChromeDriver();
		chrdriver.get("https://en-gb.facebook.com/");
		// Add implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chrdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		// To maximize the window		
		chrdriver.manage().window().maximize();
		// Click on Create New Account button
		WebElement CreateAccount = chrdriver.findElement(By.linkText("Create New Account"));
		CreateAccount.click();
		// Enter the first name
		WebElement FirstName = chrdriver.findElement(By.name("firstname"));
		FirstName.sendKeys("Hari Shivapriya");
		// Enter the last name
		WebElement LastName = chrdriver.findElement(By.name("lastname"));
		LastName.sendKeys("G");
		// Enter the mobile number
		WebElement MobileNum = chrdriver.findElement(By.xpath("//input[contains(@name,'reg_email__')]"));
		MobileNum.sendKeys("9159881380");
		// Enter the password
		WebElement Password = chrdriver.findElement(By.name("reg_passwd__"));
		Password.sendKeys("y31sG01");
		// Handle all the three drop downsSsession 
		// To select date
		Select dd1 = new Select(chrdriver.findElement(By.id("day")));
		dd1.selectByValue("31");
		// To select month
		Select dd2 = new Select(chrdriver.findElement(By.name("birthday_month")));
		dd2.selectByIndex(0);
		// To select year
		Select dd3 = new Select(chrdriver.findElement(By.id("year")));
		dd3.selectByVisibleText("1999");
		// To Select the radio button "Female"
		WebElement rbFemale = chrdriver.findElement(By.xpath("//input[@value='1']"));
		rbFemale.click();
		WebElement Signup = chrdriver.findElement(By.name("websubmit"));
		Signup.click();
		// To close the browser
		chrdriver.close();

	}

}
