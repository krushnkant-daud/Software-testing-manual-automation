package seleniumWebdriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {

		@Test
		public void testTitles() {
			String act_result = "faceboo";
			String exp_result = "facebook";
			
			Assert.assertEquals(act_result, exp_result);
		}
}
