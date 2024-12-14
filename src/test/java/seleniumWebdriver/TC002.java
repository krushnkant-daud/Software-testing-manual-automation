package seleniumWebdriver;

import java.lang.ref.SoftReference;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
1. Open Application
2. Enter invalid username
3. Enter valid password
4. Click Login
 */
public class TC002 {

	ChromeDriver driver = new ChromeDriver();
	SoftAssert sa = new SoftAssert();

	@Test(priority = 1)
	public void testOpenApplication() {
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void testUserName() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		// Assert.assertEquals("admin", "admin");
		sa.assertEquals("admin", "ad");
		sa.assertAll();

	}

	@Test(priority = 3)
	public void testPassword() {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("admin@123");
		// Assert.assertEquals("admin@123", "admin@123");
		sa.assertEquals("admin@123", "admin@123");
	}

	@Test(priority = 4)
	public void testlogin() {
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	}

}
