package day2;

public class Account {
private long id;
private String name;
private double amount;
//default constructor
public Account()
{	
	
}
public Account(long id, String name, double amount) {
	
	this.id = id;
	this.name = name;
	this.amount = amount;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getamount() {
	return amount;
}
public void setamount(double amount) {
	this.amount = amount;
}
//withdrawal method
public void withDrawl(double amount)
{
	
	this.amount=this.amount-amount;
}
//deposit method
public void deposit(double amount)
{
	this.amount+=amount;
}
@Override
public String toString() {
	return "Account [id=" + id + ", name=" + name + ", amount=" + amount+ "]";
}

}
