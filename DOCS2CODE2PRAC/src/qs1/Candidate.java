package qs1;

public class Candidate {

	public Candidate() {
		// TODO Auto-generated constructor stub
	}
public Candidate(String name, String gender, double expectedSalary) {
		super();
		this.name = name;
		this.gender = gender;
		this.expectedSalary = expectedSalary;
	}
private String name;
private String gender;
private double expectedSalary;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public double getExpectedSalary()  {
	return expectedSalary;
}
@Override
public String toString() {
	return "Candidate [name=" + name + ", gender=" + gender + ", expectedSalary=" + expectedSalary + "]";
}
public void setExpectedSalary(double expectedSalary) {
	this.expectedSalary = expectedSalary;
}

}
