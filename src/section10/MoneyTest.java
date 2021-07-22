package section10;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {
	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(new Dollar(10, "USD"), five.times(2));
		assertEquals(new Dollar(15, "USD"), five.times(3));
	}

	@Test
	public void testEquality() {
		assertEquals(Money.dollar(5), Money.dollar(5));
		assertNotEquals(Money.dollar(5), Money.dollar(6));
		assertEquals(Money.franc(5), Money.franc(5));
		assertNotEquals(Money.franc(5), Money.franc(6));
		assertNotEquals(Money.franc(5), Money.dollar(5));
	}

	@Test
	public void testFrancMultiplication() {
		Franc five = new Franc(5, "CHF");
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}

	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}

	@Test
	public void testDifferentClassEquality() {
		assertEquals(new Money(10, "CHF"), new Franc(10, "CHF"));
	}
}
