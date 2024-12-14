package seleniumWebdriver;
//verify page URL

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC017 {

	ChromeDriver driver = new ChromeDriver();

	@Test(priority = 20)
	public void testPageURL() {
		driver.get("https://www.facebook.com/login.php/");
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.facebook.com/login.php/", "Page URL mismatch");
	}

}
