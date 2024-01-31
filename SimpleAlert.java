package week5.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span[2]")).click();
		Alert simpleAlert= driver.switchTo().alert();
		String alert= simpleAlert.getText();
		System.out.println("alert message is " +alert);
		
		Thread.sleep(2000);
	simpleAlert.accept();
	
	String verifyMsg= driver.findElement(By.id("simple_result")).getText();
	System.out.println("verifyMsg");

	}

}
