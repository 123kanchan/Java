package lab9junit;

public class Person2 {
private int id;
String name;
char gender;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Person2 [id=" + id + ", name=" + name + ", gender=" + gender + "]";
}
public Person2(int id, String name, char gender) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
}
public Person2() {
	super();
	// TODO Auto-generated constructor stub
}


}
