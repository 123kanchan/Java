package day5;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {
	public int compare(Customer b1, Customer b2) {
		//here we are reusing the code
		
		return b1.getName().compareTo(b2.getName());
		
		
	}

}
