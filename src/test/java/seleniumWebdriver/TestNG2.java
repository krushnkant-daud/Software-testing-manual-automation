package seleniumWebdriver;
/*
1)Opening the application.
2)log-in into application.
3)log-out into application.
 */

import org.testng.annotations.Test;

public class TestNG2 {
	
	//Opening the application.
	@Test(priority = 1)
	public void openApplication() {
		System.out.println("Application Opening...");
	}
	
	//log-in to application.
	@Test(priority = 2)
	public void login() {
		System.out.println("Log-in to application");
	}
	
	//log-out to application.
	@Test(priority = 3)
	public void logout() {
		System.out.println("log-out from application");
	}
}
