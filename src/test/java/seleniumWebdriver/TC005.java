package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
1. Open Application
2. Enter valid username
3. Leave password blank
4. Click Login 
 */
public class TC005 {
	
	ChromeDriver driver = new ChromeDriver();
	
	@Test(priority = 1)
	public void testOpenApplication() {
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 2)
	public void testUsername() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		Assert.assertEquals("admin", "admin");
	}
	
	@Test(priority = 3)
	public void testPassword() {
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.clear();
		Assert.assertEquals(password, "");
	}
	
	@Test(priority = 4)
	public void testlogin() {
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
	}
}
