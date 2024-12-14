package seleniumWebdriver;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion2 {

	//@Test
	public void test_Hardassertion() {
		System.out.println("Testing");
		System.out.println("Testing");

		Assert.assertEquals(1, 2);

		System.out.println("Testing");
		System.out.println("Testing");

	}

	@Test
	public void test_Softassertion() {
		System.out.println("Testing");
		System.out.println("Testing");

		SoftAssert s = new SoftAssert();
		s.assertEquals(1, 2);

		System.out.println("Testing");
		System.out.println("Testing");
		s.assertAll();

	}
}
