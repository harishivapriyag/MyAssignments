package week5.day2.ClassroomExercise;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


//CreateLead testcase extending the BaseClass by applying inheritance and removed all the common code
public class CreateLead extends BaseClass1{

	@Test //testcase1 
	public void runCreateLead() {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();

	}
}






