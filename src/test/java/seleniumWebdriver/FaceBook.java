package seleniumWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("harshal");
		
		String title = driver.getTitle();
		//System.out.println(title);
		if(title.equals("Log in to Facebook")) {
			System.out.println("Test Case Pass Successfully");
		}else {
			System.out.println("Test Case Fail...You have to work on it.");
		}
		driver.close();
		
		
	
	}
}
