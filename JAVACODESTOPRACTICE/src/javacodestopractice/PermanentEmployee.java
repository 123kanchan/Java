package javacodestopractice;

public class PermanentEmployee extends Employee {
	   private  double basicPay;
	public PermanentEmployee() {
		// TODO Auto-generated constructor stub
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
public double getBasicPay() {
	return basicPay;
}

public PermanentEmployee(int eid,String ename,double basicpay)
{
	this.employeeId=eid;
	this.employeeName=ename;
	this.basicPay=basicpay;
}
@Override
public double  calculateSalary() {
	
 salary = basicPay-(basicPay*0.12);
    return salary;
}


}
