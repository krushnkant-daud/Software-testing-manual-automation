package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//Verify password field is displayed or not.
public class TC011 {
	
	ChromeDriver driver = new ChromeDriver();
	
	@Test(priority = 3)
	public void testPasswordFieldDisplay() {
	    driver.get("https://www.facebook.com/login.php/");
	    Boolean passwordStatus = driver.findElement(By.xpath("//input[@id='pass']")).isDisplayed();
	    Assert.assertTrue(passwordStatus, "Password field is not displayed");
	    driver.close();
	}

}
