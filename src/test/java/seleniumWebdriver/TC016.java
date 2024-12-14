package seleniumWebdriver;
//Verify log-in without username

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC016 {
	
	ChromeDriver driver = new ChromeDriver();
	
	@Test(priority = 18)
	public void testLoginWithoutPassword() {
	    driver.get("https://www.facebook.com/login.php/");
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
	    driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	    String errorMessage = driver.findElement(By.xpath("//a[normalize-space()='Find your account and log in.']")).getText();
	    Assert.assertEquals(errorMessage, "Find your account and log in.");
	    //System.out.println(errorMessage);
	    driver.close();
	}

}
