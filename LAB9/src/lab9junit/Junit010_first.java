package lab9junit;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class Junit010_first{
	@Test
	public void testGetFullName() {
		System.out.println("from TestPerson2");
		Person per = new Person("Kanchan", "Rawat");
		assertEquals("Kanchan Rawat", per.getFullName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNullsInName() {
		System.out.println("from TestPerson2 testing exceptions");
		Person per1 = new Person(null, null);
	}
}
