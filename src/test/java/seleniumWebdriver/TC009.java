package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//Verify log-in button is displayed or not.
public class TC009 {
	
	ChromeDriver driver = new ChromeDriver();
	
	@Test(priority = 1)
	public void testLoginButtonDisplay() {
	    driver.get("https://www.facebook.com/login.php/");
	    Boolean buttonStatus = driver.findElement(By.xpath("//button[@id='loginbutton']")).isDisplayed();
	    Assert.assertTrue(buttonStatus, "Login button is not displayed");
	    driver.close();
	}

}
