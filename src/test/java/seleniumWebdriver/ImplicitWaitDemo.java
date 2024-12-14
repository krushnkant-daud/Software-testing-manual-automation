package seleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {
	
	public static void main(String[] args)  {
		ChromeDriver driver = new ChromeDriver();
		
		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("admin");
	}
}
