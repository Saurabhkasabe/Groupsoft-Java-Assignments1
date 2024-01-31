package week5.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]")).click();
		
		Alert confirmAlert= driver.switchTo().alert();
		System.out.println(confirmAlert.getText());
		confirmAlert.sendKeys("Saurabh");
		confirmAlert.accept();
	String Text=	driver.findElement(By.id("confirm_result")).getText();
	if(Text.contains("Saurabh")){
	System.out.println("Alert is Prompt");
		
	}

}
}
