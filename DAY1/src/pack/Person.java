//qs 2.1
package pack;

public class Person {
	private 
	String fname,lname;
	char gender;
	int age;
	float weight;
	public Person()
	{
		
	}
public Person(String f1,String f2,int age,char gender,float weight)
{
	fname=f1;
	lname=f2;
	this.age=age;
	this.gender=gender;
	this.weight=weight;
}
	public void setName(String fname,String lname)
	{
		this.fname=fname;
		this.lname=lname;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setGender(char gender)
	{
		this.gender=gender;
	}
	public void setWeight(float weight)
	{
		this.weight=weight;
	}
	public String getName(){
		return fname + " " +lname;
	}
	public int getAge(){
		return age;
	}
	public char getGender(){
		return gender;
	}
	public float getWeight(){
		return weight;
	}

	public String toString()
	{
		return "Name: " + this.fname +this.lname+ "\n"+ "Gender:" +gender+"\n"+ "age: "+
	 age+"\n"+"weight: " + weight;
	}
}
