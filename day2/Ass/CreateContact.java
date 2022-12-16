package week2.day2.Ass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// To load the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		//To maximize the window size
		driver.manage().window().maximize();
		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		// To enter the UserName Using Id Locator
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("demoCsr");
		// To enter the Password Using Id Locator
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("crmsfa");
		// To Click on Login Button using Class Locator
		WebElement Login = driver.findElement(By.className("decorativeSubmit"));
		Login.click();
		// To Click on CRM/SFA Link
		WebElement a = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")); //linkText("CRM/SFA")
		a.click();
		// To  Click on contacts Button
		WebElement contacts = driver.findElement(By.linkText("Contacts"));
		contacts.click();
		// To Click on Create Contact
		WebElement CreateContact = driver.findElement(By.linkText("Create Contact"));
		CreateContact.click();
		// To Enter FirstName Field Using id Locator
		WebElement FirstNameField = driver.findElement(By.id("firstNameField"));
		FirstNameField.sendKeys("HariShivapriya");
		// To Enter LastName Field Using id Locator
		WebElement LastNameField = driver.findElement(By.id("lastNameField"));
		LastNameField.sendKeys("G");
		// To Enter FirstName(Local) Field Using id Locator
		WebElement FirstNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
		FirstNameLocal.sendKeys("Hari");
		// To Enter LastName(Local) Field Using id Locator
		WebElement LastNameLocal= driver.findElement(By.id("createContactForm_lastNameLocal"));
		LastNameLocal.sendKeys("G");
		// To Enter Department Field Using any Locator of Your Choice
		WebElement Department = driver.findElement(By.name("departmentName"));
		Department.sendKeys("Computer Technology");
		// To Enter Description Field Using any Locator of your choice 
		WebElement Description = driver.findElement(By.xpath("//textarea[contains(@name,'description')]"));
		Description.sendKeys("Computer Technology provides enough knowledge to handle both hardware and software and also theoretical foundations of information and computation and their implementation and application in computer systems.");
		// To Enter your email in the E-mail address Field using the locator of your choice
		WebElement email = driver.findElement(By.id("createContactForm_primaryEmail"));
		email.sendKeys("harishivapriya1@gmail.com");
		// To Select State/Province as NewYork Using Visible Text
		Select Statedd1 =new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		Statedd1.selectByVisibleText("New York");
		// To Click on Create Contact
		WebElement CreateContactbutton = driver.findElement(By.xpath("//input[@name='submitButton']"));
		CreateContactbutton.click();
		// To Click on edit button 
		WebElement edit = driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
		edit.click();
		// To Clear the Description Field using .clear
		WebElement Descriptionclear = driver.findElement(By.id("updateContactForm_description"));
		Descriptionclear.clear();
		// To Fill ImportantNote Field with Any text
		WebElement ImportantNote = driver.findElement(By.name("importantNote"));
		ImportantNote.sendKeys("The use and study of computers, networks, computer languages, and databases within an organization to solve real problems.");
		// To Click on update button using X path locator
		WebElement updatebutton = driver.findElement(By.xpath("//input[@value='Update']"));
		updatebutton.click();		
		// To Get the Title of Resulting Page.
		String title = driver.getTitle();
		// To print the title
		System.out.println("The title of the current page is : " +title);
		
	}

}
