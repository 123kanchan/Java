package day5;

import java.util.Objects;

public class Customer implements Comparable<Customer>{
private int id;
private String name;
private double amountpaid;
private int creditscore;
@Override
public int hashCode() {
	return Objects.hash(amountpaid, creditscore, id, name);
}
@Override
public boolean equals(Object obj) {
	
	
	 Customer b=(Customer)obj; if (b==null) return false;
	  
	  if(this.id==b.id &&this.name.equals(b.name) && this.amountpaid==b.amountpaid &&
	  this.creditscore==b.creditscore) 
	  return true; 
	  else return false;
	
	
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", amountpaid=" + amountpaid + ", creditscore=" + creditscore
			+ "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getAmountpaid() {
	return amountpaid;
}
public void setAmountpaid(double amountpaid) {
	this.amountpaid = amountpaid;
}
public int getCreditscore() {
	return creditscore;
}
public void setCreditscore(int creditscore) {
	this.creditscore = creditscore;
}
public Customer(int id, String name, double amountpaid, int creditscore) {
	super();
	this.id = id;
	this.name = name;
	this.amountpaid = amountpaid;
	this.creditscore = creditscore;
}
@Override
public int compareTo(Customer c1) {
	if (this.id == c1.id)
		return 0;
	else if(this.id > c1.id)
		return 1;
	else
		return -1;
	
}
}
