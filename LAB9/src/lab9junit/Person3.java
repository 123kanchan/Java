package lab9junit;
import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Person3 {

	public Person3() {
		
	}
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "name="+name+"age="+age;
	}
	public boolean validateName(String name)throws Nameexception
	{
		Pattern p=Pattern.compile("^[a-zA-Z]*");
	Matcher m=p.matcher(name);
	if(m.matches()!=true)
	{
		throw new Nameexception("name invalid");
	}
	else
		return true;
	}
	public boolean validateAge(int age) throws Ageexception  
	{
		if(age<21)
		{
			throw new Ageexception("Age not allowed");
		}
		else
			return true;
		
	}
}
