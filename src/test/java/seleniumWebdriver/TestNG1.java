package seleniumWebdriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG1 {

	@Test
	public void test() {
		Assert.assertEquals(3, 3);
	}

	@Test
	public void addtest() {
		Assert.assertEquals(2 * 2, 4);
	}
	
	@Test
	public void testadd() {
		TestNG t = new TestNG();
		Assert.assertEquals(t.add(2, 2), 4);
	}

}
