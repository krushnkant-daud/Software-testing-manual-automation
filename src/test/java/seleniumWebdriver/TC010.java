package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//Verify email field is displayed or not.
public class TC010 {
	
	ChromeDriver driver = new ChromeDriver();
	
	@Test(priority = 2)
	public void testEmailFieldDisplay() {
	    driver.get("https://www.facebook.com/login.php/");
	    Boolean emailStatus = driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
	    Assert.assertTrue(emailStatus, "Email field is not displayed");
	    driver.close();
	}

}
