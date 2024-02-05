package week5.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassActivity {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
		driver.get("https://www.amazon.in/");
		WebElement scrldown=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[6]/span"));
         Actions ac= new Actions(driver);
         ac.scrollToElement(scrldown).perform();
         
         File src = driver.getScreenshotAs(OutputType.FILE);
 		File dest = new File("./naps/amazon.png");
 		FileUtils.copyFile(src, dest);
}
}
