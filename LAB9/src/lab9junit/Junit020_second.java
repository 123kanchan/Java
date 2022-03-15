package lab9junit;
import static org.junit.Assert.*;
import org.junit.*;
public class Junit020_second {

	 Date d=new Date(26,05,2000);
@Test
public void testsetDay()
{
	d.setDay(25);
	assertTrue(d.getDay()==25);
}
@Test
public void testgetDay()
{
	d.setDay(26);
	assertTrue(d.getDay()==26);
}
@Test
public void testsetMonth()
{d.setMonth(05);
assertTrue(d.getMonth()==5);
}
@Test
public void testgetMonth()
{d.setMonth(05);
assertTrue(d.getMonth()==5);
}
@Test
public void testGetYear()
{
	d.setYear(2001);
	assertTrue(d.getYear()==2001);
}
@Test
public void testDate()
{
	Date d=new Date(26,11,1999);
	assertEquals("Date is 26/11/1999",d.toString());
}
}
