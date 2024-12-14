package seleniumWebdriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 1)log-in
 2)buy
 3)log-out
 4)log-in
 5)buy-again
 6)log-out
 */
public class Annotation1 {
	@BeforeMethod
	public void login() {
		System.out.println("logging...");
	}
	
	@Test
	public void buy() {
		System.out.println("Buying...");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("loged-out!");
	}
	
	@Test
	public void buyagain() {
		System.out.println("Again buying something!");
	}
}
