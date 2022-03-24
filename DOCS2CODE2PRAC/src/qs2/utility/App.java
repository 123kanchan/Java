package qs2.utility;

import java.sql.Connection;
import qs2.*;
import qs2.utility.*;
import qs2.model.Customer;

public class App {
	public static void main(String args[]) {
		CustomerServiceImplementation cus=new CustomerServiceImplementation();
		
		int ret=cus.addCustomer(new Customer(4,"kanchan","k123@gmail.com","dehra",123456789,"xyz"));
		if(ret==1)
			System.out.println("Successfully added");
		ret=cus.addCustomer(new Customer(5,"mary","mary@gmail.com","shimla",123569872,"pqr"));
		if(ret==1)
			System.out.println("Successfully added\n");
		
		for(Customer obj:cus.getCustomer())
			System.out.println(obj);
		
		System.out.println("\n");
		
		
		for(Customer obj:cus.getCustomer())
			System.out.println(obj);
		
		System.out.println(cus.getCustomerBasedOnCity("xyz"));
		System.out.println();
		
		System.out.println(cus.deleteCustomer(2));
			
	}
}
