package section8;

import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyTest {
	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}
}
