package Week6.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class createOpportunity {

	public static void main(String[] args) throws InterruptedException {
		
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(option);
		    //WebDriver driver = new ChromeDriver(option);
		    driver.get("https://login.salesforce.com");
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			driver.findElement(By.id("username")).sendKeys("ragunath.testleaf@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Testleaf@123");
			driver.findElement(By.id("Login")).click();
			Thread.sleep(5000);
			//ChromeOptions option =new ChromeOptions();
			option.addArguments("--disable-notifications");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='App Launcher']//parent::div")).click();
			driver.findElement(By.xpath("//button[text()='View All']//self::button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[@class='slds-text-heading_small'])[8]")).click();
			WebElement oppt  = driver.findElement(By.xpath("//span[text()='Opportunities']//parent::a"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", oppt);
			driver.findElement(By.xpath("//div[text()='New']//parent::a")).click();
			driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Saurabh Kasabe");//gettext
			driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
			//js.executeScript("windows.scrollBy(0,500)");
			driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
			driver.findElement(By.xpath("//span[text()='10']")).click();
			WebElement  stage = driver.findElement(By.xpath("//button[@id='combobox-button-371']//self::button"));
			js.executeScript("arguments[0].click()", stage);
			driver.findElement(By.xpath("(//span[@class='slds-media__body'])[4]")).click();
			driver.findElement(By.xpath("//button[text()='Save'][2]")).click();
			Thread.sleep(2000);
			Assert.assertEquals(driver.getTitle(), "Salesforce Automation by Your Name");
			driver.getPageSource().contains("Salesforce Automation by Your Name");
			driver.quit();
			
			
			//driver.findElement(By.xpath("(//div[@class='navexSetupNav']//preceding::div)[122]")).click();	
		}
	}


