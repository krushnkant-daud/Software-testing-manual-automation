package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
1. Open Application
2. Leave username blank
3. Enter valid password
4. Click Login
 */
public class TC006 {

	ChromeDriver driver = new ChromeDriver();

	@Test(priority = 1)
	public void testOpenApplication() {
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void testUsername() {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		Assert.assertEquals(username, "");
	}

	@Test(priority = 3)
	public void testPassword() {
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("admin@123");
		Assert.assertEquals("admin@123", "admin@123");
	}

	@Test(priority = 4)
	public void testlogin() {
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();

	}
}
