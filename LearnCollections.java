package week4.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCollections {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles", Keys.ENTER);
		 
		 List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
		
		 for (int i = 0; i < prices.size(); i++) {
		String text = prices.get(i).getText();
			System.out.println(text);
		 
		 
		 
	}

	}
}
