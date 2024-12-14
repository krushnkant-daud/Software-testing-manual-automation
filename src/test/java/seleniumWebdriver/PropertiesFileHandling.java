package seleniumWebdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PropertiesFileHandling {

	@Test
	public void testvarify() throws Exception {

		Properties property = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\configure.properties");
		property.load(file);

		String browser = property.getProperty("Browser");
		System.out.println(browser);

		ChromeDriver driver = new ChromeDriver();
		driver.get(property.getProperty("Url"));

		driver.findElement(By.xpath(property.getProperty("emailaddress&phone"))).sendKeys("Harshal daud");
		driver.findElement(By.xpath(property.getProperty("password"))).sendKeys("admin@123");
		driver.findElement(By.xpath(property.getProperty("loginbutton"))).click();

//		Assert.assertEquals("admin@123", "admin@12");
//		Assert.assertEquals("Harshal", "Harsha");
		
		SoftAssert s = new SoftAssert();
		s.assertEquals("admin@123", "admin@123");
		s.assertEquals("Harshal", "Harshal");
		
		System.out.println("clicked!");
		
		s.assertAll();
	}
}
