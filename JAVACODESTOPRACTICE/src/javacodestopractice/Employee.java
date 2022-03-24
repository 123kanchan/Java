package javacodestopractice;

public abstract class Employee {

   protected int employeeId;
   protected String employeeName;
   protected double salary;
    public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
    public Employee(int employeeId,String employeeName)
    {
    	this.employeeId=employeeId;
    	this.employeeName=employeeName;
    }
	@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
}
	public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public abstract double calculateSalary();


}
