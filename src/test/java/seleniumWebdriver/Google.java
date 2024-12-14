package seleniumWebdriver;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
//		String pagesource = driver.getPageSource();
//		System.out.println(pagesource);
		String windowhandle = driver.getWindowHandle();
		System.out.println("id : " + windowhandle);
	//	Set <String> ids = driver.getWindowHandles();
		driver.quit();
	}
}
