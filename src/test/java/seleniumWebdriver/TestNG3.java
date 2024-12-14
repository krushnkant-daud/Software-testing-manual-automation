package seleniumWebdriver;
/*
1)Opening the application.
2)log-in into application.
3)close the application.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG3 {

	ChromeDriver driver = new ChromeDriver();

	@Test(priority = 1)
	public void openApplication() {
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void loginApplication() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("admin");
	}

	@Test(priority = 3)
	public void closeApplication() {
		driver.quit();

	}

}
