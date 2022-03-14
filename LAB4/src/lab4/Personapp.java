package lab4;

import java.util.Scanner;

public class Personapp {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	int age=sc.nextInt();
	Person accountholder=new Person(name,age);
	String name2=sc.next();
	int age2=sc.nextInt();
	Person accountholder1=new Person(name2,age2);
	accountholder1.setName(name2);
	accountholder1.setAge(age2);
	
	Savingaccount obj=new Savingaccount();
	
	Account smith=new Account(2000);
	Account kathy=new Account(3000);
	smith.setaccountholder(accountholder);
	smith.setBalance(2000);
	smith.setAccnumber(1234);
	kathy.setAccnumber(3456);
	kathy.setaccountholder(accountholder1);
	kathy.withdraw(3000);
	System.out.println(smith);
	System.out.println(kathy);
	obj.withdraw(20000);
}

}
