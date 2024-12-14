package seleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Laptops");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are : " + links.size());
		List <WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total images are :" + images.size());
		Boolean status = driver.findElement(By.xpath("//span[contains(text(),'TVs & Appliances')]")).isDisplayed();
		System.out.println(status);
		driver.quit();
	}
}
