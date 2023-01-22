package week5.day2.DynamicDataParameterization;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//CreateLead testcase extending the BaseClass by applying inheritance and removed all the common code
public class CreateLead extends BaseClass1{

	@Test(dataProvider = "fetchData") //testcase1 
	public void runCreateLead(String companyName, String firstName, String lastName) {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
	}
	@DataProvider(name="fetchData")
	public String[][] sendData(){
		String[][] data= new String[2][3];
		data[0][0]="TestLeaf";
		data[0][1]="Hari";
		data[0][2]="Shivapriya";

		data[1][0]="Harness";
		data[1][1]="Shivapriya";
		data[1][2]="G";

		return data;


	}
}






