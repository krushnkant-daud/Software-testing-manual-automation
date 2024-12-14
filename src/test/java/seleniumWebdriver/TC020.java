package seleniumWebdriver;
//verifying facebook logo

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC020 {

	public class FacebookLogoTest {
		WebDriver driver = new ChromeDriver();

		@Test
		public void testLogo() {
			driver.get("https://www.facebook.com/login.php/");

			// Check if the logo is displayed
			Boolean logo_status = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();

			// Assert the logo's visibility
			Assert.assertTrue(logo_status, "Facebook logo is not displayed on the login page");

			// Close the browser (optional)
			driver.quit();
		}
	}
}


