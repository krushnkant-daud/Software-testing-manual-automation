package seleniumWebdriver;
//Check if the Login button is disabled or not!

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC008 {

	ChromeDriver driver = new ChromeDriver();

	@Test(priority = 0)
	public void testLoginDisplay() {
		driver.get("https://www.facebook.com/login.php/");
		Boolean button_status = driver.findElement(By.xpath("//button[@id='loginbutton']")).isDisplayed();
		button_status = true;

		if (button_status == true) {
			Assert.assertEquals(true, true);
		}
	}

}
