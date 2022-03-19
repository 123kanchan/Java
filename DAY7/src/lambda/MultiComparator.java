package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MultiComparator {

	public static void main(String[] args) {
	List<Employee>empList=Arrays.asList(new Employee(50,"kanchan",499999),
			new Employee(48,"Dinesh",50000),
			new Employee(58,"Mary",60000),
			new Employee(79,"Dvya",40000));
//sorting list in ascending order of empno empnm sorting list in descending order of salary
	Comparator<Employee>cInt=(a,b)->{
		Integer empNo1=a.getEmpNo();
		Integer empNo2=b.getEmpNo();
		return empNo1.compareTo(empNo2);
	};
	Comparator<Employee>cString=(a,b)->{
String empNm1=a.getEmpNm();
		String empNm2=b.getEmpNm();
		return empNm1.compareTo(empNm2);		
	};
	Comparator<Employee>cFloat=(a,b)->{
		//descending order
		Float empSal1=a.getSal();
		Float empSal2=b.getSal();
		return empSal2.compareTo(empSal1);		
	};
	
	empList.sort(cInt);
	
	System.out.println("accoding to employeenumber ");
	for(Employee e:empList)
	{
		System.out.println(e);
	}
	System.out.println("accoding to employeename ");
	empList.sort(cString);
	for(Employee e:empList)
	{
		System.out.println(e);
	}
	System.out.println("accoding to employeesal ");
	empList.sort(cFloat);
	for(Employee e:empList)
	{
		System.out.println(e);
	}
	}

}
class Employee {
	private int empNo;
	private String empNm;
	private float sal;
	public Employee(int empNo, String empNm, float sal) {
		super();
		this.empNo = empNo;
		this.empNm = empNm;
		this.sal = sal;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empNm=" + empNm + ", sal=" + sal + "]";
	}
}