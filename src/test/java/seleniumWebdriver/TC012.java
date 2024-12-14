package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//Verify forgot link is displayed or not.
public class TC012 {
	
	ChromeDriver driver =  new ChromeDriver();
	
	@Test(priority = 4)
	public void testForgottenAccountLinkDisplay() {
	    driver.get("https://www.facebook.com/login.php/");
	    Boolean linkStatus = driver.findElement(By.xpath("//a[normalize-space()='Forgotten account?']")).isDisplayed();
	    Assert.assertTrue(linkStatus, "Forgotten Account link is not displayed");
	    driver.close();
	}

}
