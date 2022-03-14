package day4exceptionhandling;
import java.time.*;
public class Product {
private int id;
private String description;
private LocalDate date;
@Override
public String toString() {
	return "Product [id=" + id + ", description=" + description + ", date=" + date + "]";
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int id, String description, LocalDate date) {
	super();
	this.id = id;
	this.description = description;
	this.date = date;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public String checkDate(LocalDate date)throws ContractExpiredException
{
	
	LocalDate d1=LocalDate.now();
	Period p = Period.between(date, d1);
	if(p.getYears()<=2)
	{
		
		return("contract not expired");
	}
	else
		throw new ContractExpiredException("contract expired not valid");
}
}
