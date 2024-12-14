package seleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitDemo {
	
	public static void main(String[] args)  {
		ChromeDriver driver = new ChromeDriver();
		
		WebDriverWait exp_wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//explicit wait statement
		
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("admin");
		WebElement element = exp_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
		element.sendKeys("admin");
	}
}
