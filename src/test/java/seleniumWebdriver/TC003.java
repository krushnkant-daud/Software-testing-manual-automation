package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
1.Open Application
2. Enter valid username
3. Enter invalid password
4. Click Login
 */
public class TC003 {
	
	ChromeDriver driver = new ChromeDriver();
	SoftAssert sa = new SoftAssert();
	
	@Test(priority = 1)
	public void testOpenApplication() {
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 2)
	public void testUsername() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		//Assert.assertEquals("admin", "admin");
		sa.assertEquals("admin", "admin");
	}
	
	@Test(priority = 3)
	public void testPassword() {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("admin@123");
		//Assert.assertEquals("admin@123", "admin@12");
		sa.assertEquals("admin@123", "admin@12");
		sa.assertAll();
	}
	
	@Test(priority = 4)
	public void testLogin() {
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		//sa.assertAll();
	}
}
