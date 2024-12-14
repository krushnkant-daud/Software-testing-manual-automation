package seleniumWebdriver;
//Verify log-in button text

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC014 {

	ChromeDriver driver = new ChromeDriver();

	@Test(priority = 17)
	public void testLoginButtonText() {
		driver.get("https://www.facebook.com/login.php/");
		String buttonText = driver.findElement(By.id("loginbutton")).getText();
		Assert.assertEquals(buttonText, "Log in");
		driver.close();
	}

}
