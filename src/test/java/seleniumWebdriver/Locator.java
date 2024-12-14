package seleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	public static void main(String[] args){
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
	
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("harshal daud");
		boolean status = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		System.out.println(status);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Hello");
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
 		
		List <WebElement>  links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links : " + links.size());

//		List<WebElement> images = driver.findElements(By.tagName("img"));
//		System.out.println("Total images : " + images.size());
//		for(int i = 0; i < links.size(); i++) {
//			System.out.println(links);
//		}
		driver.quit();
	}
}
