package lab3;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Seventh {
private int id,age;
private String fname;
private String lname;
private String fullname;
public int getAge() {
	return age;
}
@Override
public String toString() {
	return "Seventh [id=" + id + ", age=" + age + " fullname=" + fullname
			+ "]";
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fname,String lname) {
	fullname=fname+lname;
}
public void setAge(String age) {
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate d1=LocalDate.parse(age,formatter);
	LocalDate date2=LocalDate.now();
	Period p = Period.between(d1, date2);
	this.age=p.getYears();
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
