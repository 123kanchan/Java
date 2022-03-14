package lab4;
import java.util.*;
public class Account {

	Person accountholder;
	

private long accnumber;
protected double balance;
public long getAccnumber() {
	return accnumber;
}
public void setAccnumber(long accnumber) {
	this.accnumber = accnumber;
}
public double getBalance() {
	System.out.println("balance left :");
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public Person getaccountholder() {
	return accountholder;
}
public void setaccountholder(Person obj) {
	this.accountholder = obj;
}
@Override
public String toString() {
	return "person [accnumber=" + accnumber + ", balance=" + balance + ", accountholder=" + accountholder + "]";
}
public Account(long accnumber, double balance, Person accountholder) {
	super();
	this.accnumber = accnumber;
	this.balance = balance;
	this.accountholder = accountholder;
}
public Account() {
	super();
	
}
public Account(double balance) {
	this.balance=balance;	
}

public void withdraw(double amount)
{
	this.balance=this.balance-amount;
}

}
