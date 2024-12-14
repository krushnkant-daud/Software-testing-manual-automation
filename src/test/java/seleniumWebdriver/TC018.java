package seleniumWebdriver;
//verify sign-up link

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC018 {
	ChromeDriver driver = new ChromeDriver();

	@Test(priority = 10)
	public void testSignUpLink() {
		driver.get("https://www.facebook.com/login.php/");
		Boolean signUpLink = driver.findElement(By.xpath("//a[normalize-space()='Sign up for Facebook']")).isDisplayed();
		Assert.assertTrue(signUpLink, "Sign-Up link is not displayed");
	}

}
