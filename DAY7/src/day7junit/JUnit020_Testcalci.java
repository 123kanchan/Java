package day7junit;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class JUnit020_Testcalci {
	
	private static Calculator c=null;
	private int val1=20;
	private int val2=10;
	@BeforeClass
	public static void initOnce()
	{
		System.out.println("In before class");
		c=new Calculator();
	}
	@AfterClass
	
	public static void cleanOnce()
	{
		System.out.println("In after class");
	}
	@Before
	public void initMethod() {
		System.out.println("In before");
		
	 val1=20;
		val2=10;
	}
	@After
	public void cleanMethod() {//to clean resources by before()
		System.out.println("In after");
	}
@Test
public void testAddition() {

	
	int actualresult=30;
	int calcualtedresult=c.add(val1, val2);
	assertEquals(actualresult,calcualtedresult);
}

@Test
public void testSubtraction() {

	int actualresult=10;
	int calcualtedresult=c.subtract(val1, val2);
	assertEquals(actualresult,calcualtedresult);
}

@Test
public void testMultiplication() {

	int actualresult=200;
	int calcualtedresult=c.mult(val1, val2);
	assertEquals(actualresult,calcualtedresult);
}
@Test
public void testdivision01() {

	int actualresult=2;
	int calcualtedresult=c.divide(val1, val2);
	assertEquals(actualresult,calcualtedresult);
}
@Ignore
@Test(expected=ArithmeticException.class)
public void testdivision02() {
val2=0;
	int actualresult=2;
	int calcualtedresult=c.divide(val1, val2);
	assertEquals(actualresult,calcualtedresult);
}
}
