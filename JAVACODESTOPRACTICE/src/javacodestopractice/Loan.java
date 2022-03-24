package javacodestopractice;

public class Loan {

	public Loan() {
		// TODO Auto-generated constructor stub
	}
	Employee obj=new PermanentEmployee();
	Employee obj1=new TemporaryEmployee();
public double calculateLoanAmount(Employee employeeobj)
{double loanamount=0.0f;
	if(employeeobj instanceof PermanentEmployee)
	{
		double sal=employeeobj.calculateSalary();
		 loanamount=(15*sal)/100.00;
	}
	else if(employeeobj instanceof TemporaryEmployee)
	{
		double sal=employeeobj.calculateSalary();
		 loanamount=(10*sal)/100.00;
	}
	return loanamount;
}
}
