package week5.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
		driver.get("https://www.amazon.in/");
		
	String pHandle=	driver.getWindowHandle();
	System.out.println("Parent Window Handle "+pHandle);
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Set<String> windowHandles= driver.getWindowHandles();
		//System.out.println(windowHandles.size());
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		driver.switchTo().window( windowHandlesList.get(1));
		WebElement findElement = driver.findElement(By.id("add-to-cart-button"));
        driver.executeScript("arguments[0].click();", findElement);
		
	}

}
