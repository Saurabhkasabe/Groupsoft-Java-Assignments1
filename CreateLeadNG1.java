package Week6.day3;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadNG1 extends BaseClass1 {
	@DataProvider (name="getData")
	public String[][] setData(){
	String [][] data=new String [2][3];
	return data;
	}
	
	@Test(dataProvider="getData")
	public void CreateLead(String CompanyName, String FirstName, String LastName) {
	    driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys( CompanyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		driver.findElement(By.name("submitButton")).click();
	
		
		

	}


}
