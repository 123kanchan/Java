package lab6;


public class Person {
private String fname;
private String lname;
char gender;
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
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Person [fname=" + fname + ", lname=" + lname + ", gender=" + gender + "]";
}
public Person(String fname, String lname, char gender) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.gender = gender;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}

}
