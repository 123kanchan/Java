package practicelambda;

public class Person {
private int age;
private String fname;
private String lname;
	public Person(int age, String fname, String lname) {
	super();
	this.age = age;
	this.fname = fname;
	this.lname = lname;
}
	@Override
public String toString() {
	return "Person [age=" + age + ", fname=" + fname + ", lname=" + lname + "]";
}
	public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
	

}
