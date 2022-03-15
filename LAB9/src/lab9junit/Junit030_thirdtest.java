package lab9junit;
import static org.junit.Assert.*;
import org.junit.*;
public class Junit030_thirdtest {
Person3 obj=null;
@Test
public void testdetails()
{
	obj=new Person3();
	obj.setName("kanchan");
	obj.setAge(21);
	assertEquals("name=kanchanage=21",obj.toString());
}
@Test(expected=Nameexception.class)
public void testname()throws Nameexception
{
	Person3 ob=new Person3();
	String a="12er";
	if(ob.validateName(a)!=true)
	{

		System.out.println("not correct");	
	}
}
@Test(expected=Ageexception.class)
public void testage()throws Ageexception
{
	Person3 ob1=new Person3();
	int age=7;
	if(ob1.validateAge(age)!=true)
	{
		System.out.println("not correct");
	}
}

}
