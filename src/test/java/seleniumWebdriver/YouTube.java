package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Songs");
			driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']//div")).click();
	//		driver.quit();
			driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']//div")).isEnabled();
			
		}
}
