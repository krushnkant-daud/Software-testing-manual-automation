package seleniumWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//Verify Title of webpage
public class TC013 {
	
	ChromeDriver driver = new ChromeDriver();
	@Test(priority = 5)
	public void testPageTitle() {
	    driver.get("https://www.facebook.com/login.php/");
	    String title = driver.getTitle();
	    Assert.assertEquals(title, "Log in to Facebook");
	    driver.close();
	}

}
