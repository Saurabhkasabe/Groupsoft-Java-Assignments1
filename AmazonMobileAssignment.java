package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobileAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		
		List<WebElement> allPrices = driver.findElements(By.className("a-price-whole"));
		List<Integer> list = new ArrayList<Integer>();
		
		for (WebElement each : allPrices) {
			String text = each.getText();
			System.out.println(text);
		}
		// Mobile prices sorting :-
		Collections.sort(list);
		System.out.println("The Size of list :" +list.size());
		Set<Integer> unique = new TreeSet<Integer>(list);
		System.out.println("The Size of Set : " +unique.size());
		System.out.println("The lowest mobile Price is : "+list.get(0));
		
		if (list.size()!=unique.size()) {
			System.out.println("Duplicates are present");
		}
		else {
			System.out.println("No Duplicates");
		}
		
	}

}
