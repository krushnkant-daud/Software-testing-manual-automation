package seleniumWebdriver;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 1.open application
 2.log-in
 3.search
 4.log-out
 */
public class DependencyMethods {

	@Test(priority = 1)
	public void testOpenApp() {
		Assert.assertTrue(false);
	}

	@Test(priority = 2, dependsOnMethods = "testOpenApp")
	public void testLogin() {
		Assert.assertTrue(true);
	}

	@Test(priority = 3, dependsOnMethods = "testLogin")
	public void testSearch() {
		Assert.assertTrue(true);
	}

	@Test(priority = 4, dependsOnMethods = "testSearch")
	public void testLogout() {
		Assert.assertTrue(true);
	}
}
