package day5hashmap;

import java.util.Objects;

import day5.Customer;

public class Student {
private long id;
private String name;
private int totalscore;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
@Override
public int hashCode() {
	return Objects.hash(id, name, totalscore);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	 Student b=(Student)obj; if (b==null) return false;
	  
	  if(this.id==b.id &&this.name.equals(b.name) && this.totalscore==b.totalscore ) 
	  return true; 
	  else return false;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(long id, String name, int totalscore) {
	super();
	this.id = id;
	this.name = name;
	this.totalscore = totalscore;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", totalscore=" + totalscore + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTotalscore() {
	return totalscore;
}
public void setTotalscore(int totalscore) {
	this.totalscore = totalscore;
}
}
