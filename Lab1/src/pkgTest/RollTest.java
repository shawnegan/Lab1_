package pkgTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import pkgCore.Roll;

public class RollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {

			// Make sure value of roll is between 1 and 12.

			Roll r = new Roll();
			boolean RollCheck = r.getScore() >= 2 && r.getScore() <= 12;
			Assert.assertTrue(RollCheck);
		}

	}

}
