package day4exceptionhandling;
import java.util.regex.*;
public class Personvalidator {
private int id;
private int age;
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Personvalidator(int id, int age, String name) {
	super();
	this.id = id;
	this.age = age;
	this.name = name;
}
public Personvalidator() {
	super();
	// TODO Auto-generated constructor stub
}

public Personvalidator(String name2, int age2) {
	// TODO Auto-generated constructor stub
	name=name2;
	age=age2;
}
public boolean validateName(String name)throws Nameexception
{
	Pattern p=Pattern.compile("^[a-zA-z]*");
	Matcher m=p.matcher(name);
	if(m.matches())
	return true;
	else
		throw new Nameexception("name is not in alphabetical order");
	
}
public boolean validateAge(int age)throws AgeException
{
	if(age>=21)return true;
	else
		throw new AgeException("age less than 21");
		
}
@Override
public String toString() {
	return "Personvalidator [id=" + id + ", age=" + age + ", name=" + name + "]";
}

}
