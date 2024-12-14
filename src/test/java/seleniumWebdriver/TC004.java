package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
1. Open Application
2. Leave username and password blank
3. Click Login
 */
public class TC004 {
	
	ChromeDriver driver = new ChromeDriver();
	SoftAssert sa = new SoftAssert();
	
	@Test(priority = 1)
	public void testOpenApplication() {
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 2)
	public void testUsername() {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.clear();
		Assert.assertEquals(username, "");
//		sa.assertEquals("admin", " " );
//		sa.assertAll();
	}
	
	@Test(priority = 3)
	public void testPassword() {
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.clear();
		Assert.assertEquals(password, "");
//		sa.assertEquals("admin@123", " ");
//		sa.assertAll();
	}
		
	@Test(priority = 4)
	public void testLogin() {
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	}
	
}
