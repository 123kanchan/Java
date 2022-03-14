package day4exceptionhandling;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class ProductApp {
	LocalDate date;
	
public static void main(String[] args) {
	Product p=null;
	try {
		
		checkContractValidity(p);
	}
	catch(ContractExpiredException e)
	{
		System.out.println(e.getMessage());
	}
}
public static void checkContractValidity(Product p)throws ContractExpiredException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id");
	int id=sc.nextInt();
	System.out.println("enter description");
	String desc=sc.next();
	System.out.println("enter date");
	String d;
	d=sc.next();
	DateTimeFormatter formater =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate datefirst =  LocalDate.parse(d,formater);
	p=new Product(id,desc,datefirst);


	
	String res=p.checkDate(datefirst);
	System.out.println(p);
	System.out.println(res);
}


}
