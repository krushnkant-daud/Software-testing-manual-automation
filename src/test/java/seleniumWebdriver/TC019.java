package seleniumWebdriver;
//verify log-in without username and password

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC019 {

	ChromeDriver driver = new ChromeDriver();
	
	@Test(priority = 22)
	public void testErrorMessageForEmptyFields() {
	    driver.get("https://www.facebook.com/login.php/");
	    driver.findElement(By.id("loginbutton")).click();
	    String errorMessage = driver.findElement(By.cssSelector(".error_message")).getText();
	    Assert.assertEquals(errorMessage.contains("The email address or mobile number you entered isn't connected to an account"), "Error message is incorrect or missing");
	}

}
