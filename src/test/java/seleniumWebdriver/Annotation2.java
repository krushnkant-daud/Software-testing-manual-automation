package seleniumWebdriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 1)log-in
 2)buy
 3)buy again
 4)log-out
 */
public class Annotation2 {

	@BeforeClass
	public void login() {
		System.out.println("log-in..");
	}
	
	@Test(priority = 1)
	public void buy() {
		System.out.println("Buying..");
	}
	
	@Test(priority = 2)
	public void buyagain() {
		System.out.println("again Buying");
	}
	
	@AfterClass
	public void logout() {
		System.out.println("loged-out");
	}
}
