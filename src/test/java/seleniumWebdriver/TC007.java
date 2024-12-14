package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC007 {

	ChromeDriver driver = new ChromeDriver();

	@Test(priority = 1)
	public void testOpenApplication() {
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void testUsername() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		Assert.assertEquals("admin", "$$$$");
	}

	@Test(priority = 3)
	public void testPassword() {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("admin@123");
		Assert.assertEquals("admin@123", "$$$$");
	}

	@Test(priority = 4)
	public void testlogin() {
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();

	}

}
