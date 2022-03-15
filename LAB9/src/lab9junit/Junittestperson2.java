package lab9junit;

import org.junit.Test;
import static org.junit.Assert.*;
public class Junittestperson2 {

	Person2 obj=new Person2(1,"kanchan",'f');
	@Test
	public void testGetid()
	{
		assertEquals(obj.getId(),1);
	}
	@Test
	public void testGender()
	{
		assertEquals(obj.getGender(),'f');
	}
@Test
public void testGetname()
{
	assertTrue(obj.getName()=="kanchan");
}
@Test
public void setperson()
{
	assertEquals("Person2 [id=" + obj.getId() + ", name=" + obj.getName() + ", gender=" + obj.getGender() + "]","Person2 [id=1, name=kanchan, gender=f]");	
}
}
