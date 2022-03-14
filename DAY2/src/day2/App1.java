package day2;

import java.util.Scanner;

public class App1 {
public static void main(String[]args)
{
	long id;
	String name;
	double amount;
	Account obj=new Account();
	obj.setId(10);
	obj.setName("kanchan");
	obj.setamount(500);
	System.out.println(obj.getId()+ obj.getName()+obj.getamount());
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id");
	id=sc.nextLong();
	System.out.println("enter name");
	name=sc.next();
  System.out.println("enter amount to deposit");
  amount=sc.nextDouble();
  Account obj2=new Account(id,name,amount);
  //before
  System.out.println(obj2);
 
  //after
 double am=sc.nextDouble();
  obj2.deposit(am);
 System.out.println(obj2);
 double am1=sc.nextDouble();
 obj2.withDrawl(am1);
 System.out.println(obj2);
}
}
