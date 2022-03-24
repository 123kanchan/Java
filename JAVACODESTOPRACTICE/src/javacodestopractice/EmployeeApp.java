package javacodestopractice;

import java.util.Scanner;

public class EmployeeApp {


public static void main(String[] args) {
	Employee obj=null;
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	switch(a){
		case 1:
		obj=new TemporaryEmployee(1,"raj",9,400);
		double sal=obj.calculateSalary();
		Loan ob=new Loan();
		System.out.println(ob.calculateLoanAmount(obj));
		break;
		case 2:
			obj=new PermanentEmployee(2,"rahul",1000);
			double sal1=obj.calculateSalary();
			Loan ob1=new Loan();
			System.out.println(ob1.calculateLoanAmount(obj));
			break;
	}
			
}

public EmployeeApp() {
	super();
	// TODO Auto-generated constructor stub
}
}
