package javacodestopractice;

public class TemporaryEmployee extends Employee {
    private int  hoursWorked;
    private int hourlyWages;

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getHourlyWages() {
		return hourlyWages;
	}

	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}

	public TemporaryEmployee(int hoursWorked, int hourlyWages) {
		super();
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}

	public TemporaryEmployee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
        salary = hoursWorked * hourlyWages;
        return salary;
	}
public  TemporaryEmployee(int eid,String ename,int  hoursWorked,int hourlywages)
{
	employeeId=eid;
	employeeName=ename;
	this.hoursWorked=hoursWorked;
	this.hourlyWages=hourlywages;
}
}
