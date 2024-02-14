package Week6.day4;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead1 extends BaseClass1 {
	public void setValues(){
		fileName= "CreateLead";
		
	}

	
	@Test(dataProvider="getData")
	public void CreateLead(String CompanyName, String FirstName, String LastName, String PhoneNumber) {
	    driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys( CompanyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(PhoneNumber);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("GroupSoftUs")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}

	driver.close();

	}

}
