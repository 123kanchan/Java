package Codesofoptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Employee
{
	
	
	private int empId;
	private String empName;
	private double salary;
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getSalary() {
		return salary;
	}
	
	
	
	
	
	
}

public class TestOptionalDemo2 {
	public static void main(String[] args)
	{
		//
	List<Employee> listOfEmp=new ArrayList();
	listOfEmp.add(null);
	listOfEmp.add(new Employee(1, "A", 5677.00));
	listOfEmp.add(new Employee(2, "B", 99990.00));
	/*
	 * for(Employee emp:listOfEmp) { System.out.println(emp.getEmpId() +
	 * " "+emp.getEmpName()); }
	 */
	
	
	Optional<Employee> optionalObj;
	for(Employee emp: listOfEmp)
	{
		//System.out.println(optionalObj.get());
		optionalObj=Optional.ofNullable(emp);
		System.out.println(optionalObj.isPresent());
		System.out.println(optionalObj);
	Employee e=optionalObj.orElse(new Employee(0, null, 0));
	System.out.println(e.getEmpId() + " "+e.getEmpName() + " "+e.getSalary());
	//System.out.println(emp.getEmpId() + " "+emp.getEmpName() + " "+emp.getSalary());
	}
	
	
	}

}
