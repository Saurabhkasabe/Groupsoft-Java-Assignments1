package Week6.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class deleteOpportunity {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
	    //WebDriver driver = new ChromeDriver(option);

		driver.get("https://login.salesforce.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("ragunath.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		//ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='App Launcher']//parent::div")).click();
		driver.findElement(By.xpath("//button[text()='View All']//self::button")).click();
		driver.findElement(By.xpath("(//div[@class='slds-truncate']//parent::div)[15]")).click();
		WebElement oppt  = driver.findElement(By.xpath("//span[text()='Opportunities']//parent::a"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", oppt);
		driver.findElement(By.xpath("(//input[@type='search']//parent::div)[2]")).sendKeys("Sales Automation by Saurabh");
		driver.findElement(By.xpath("//table/tbody/tr/td[8]/span/div/ul[@class='oneActionsRibbon']")).click();
		//delete option
		
		//driver.findElement(By.xpath("//div[text()='New']//parent::a")).click();
		//driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Saurabh");
}
}

	

